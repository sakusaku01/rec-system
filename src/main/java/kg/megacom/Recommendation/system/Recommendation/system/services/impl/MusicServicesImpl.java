package kg.megacom.Recommendation.system.Recommendation.system.services.impl;

import kg.megacom.Recommendation.system.Recommendation.system.mapper.MusicMapper;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Author;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Music;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.MusicAuthor;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.MusicGenre;
import kg.megacom.Recommendation.system.Recommendation.system.model.response.MusicRepoResponse;
import kg.megacom.Recommendation.system.Recommendation.system.model.response.MusicResponse;
import kg.megacom.Recommendation.system.Recommendation.system.repository.MusicRepository;
import kg.megacom.Recommendation.system.Recommendation.system.services.MusicServices;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
@Service
public class MusicServicesImpl implements MusicServices {
    private final MusicRepository repository;

    public MusicServicesImpl(MusicRepository repository) {
        this.repository = repository;
    }

    @Override
    public MusicDTO save(MusicDTO musicDTO, int lang) {
        return MusicMapper.INSTANCE.toDto(repository.save(MusicMapper.INSTANCE.toEntity(musicDTO)));
    }

    @Override
    public MusicDTO findById(Long id, int lang) {
        return MusicMapper.INSTANCE.toDto(repository.findById(id).orElseThrow(()->new RuntimeException("Музыка под таким id не найдена")));
    }

    @Override
    public List<MusicDTO> findAll(int lang) {
        return MusicMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public List<MusicRepoResponse> findResponse(String authorName, int lang) {
        List<MusicRepoResponse> musicRepoResponses = new ArrayList<>();
        List<MusicRepoResponse> repoResponse = repository
                .findMusicRepo(authorName);

        return repoResponse;
    }

    @Override
    public List<MusicRepoResponse>  findByName(String name, int lang) {
        return repository.findByName(name);
    }

    @PersistenceContext()
    private EntityManager em;

    @Override
    public List<?> getFilter(String author, String music, String genre, int lang) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Music> musicCriteria = cb.createQuery(Music.class);
        Root<Music> musicRoot = musicCriteria.from(Music.class);


        Join<Music, MusicAuthor> musicAuthorJoin = musicRoot.join("musics",JoinType.LEFT);
        Join<MusicAuthor, Author> musicAuthorAuthorJoin = musicAuthorJoin.join("authorId",JoinType.LEFT);

        Join<Music, MusicGenre> musicGenreJoin = musicRoot.join("musicsGenre",JoinType.LEFT);
        Join<MusicGenre,Music> genreMusicJoin = musicGenreJoin.join("genreId",JoinType.LEFT);

        List<Predicate> predicates = new ArrayList<>();

        if(author!=null){
            predicates.add(cb.and(
                    cb.equal(musicAuthorJoin.get("musicId"), musicRoot.get("id")),
                    cb.equal(musicAuthorAuthorJoin.get("name"),author)));
        }
        if(music!=null){
            predicates.add(cb.equal(musicRoot.get("name"),music));
        }
        if (genre!=null){
            predicates.add(cb.and(
                    cb.equal(musicGenreJoin.get("musicId"), musicRoot.get("id")),
                    cb.like(genreMusicJoin.get("name"),"%"+genre+"%")));
        }

        musicCriteria.distinct(true).where(predicates.toArray(new Predicate[0]));

       List<Music> musicQuery =  em.createQuery(musicCriteria).getResultList();

        List<MusicResponse> musicResponses = new ArrayList<>();

        for (Music music1:musicQuery) {
            MusicResponse response = new MusicResponse();
            response.setMusic(music1.getName());
            response.setMusicUri(music1.getFile());
            response.setAlbum(music1.getAlbumId().getName());
            response.setAuthor(author);
            response.setAddDate(music1.getAddDate());
            musicResponses.add(response);
        }
        return musicResponses;

    }
}
