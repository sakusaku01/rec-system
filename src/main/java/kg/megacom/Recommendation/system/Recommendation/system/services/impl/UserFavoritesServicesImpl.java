package kg.megacom.Recommendation.system.Recommendation.system.services.impl;

import kg.megacom.Recommendation.system.Recommendation.system.mapper.UserFavoritesMapper;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.UserFavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Genre;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Music;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.UserFavorites;
import kg.megacom.Recommendation.system.Recommendation.system.repository.GenreRepository;
import kg.megacom.Recommendation.system.Recommendation.system.repository.MusicRepository;
import kg.megacom.Recommendation.system.Recommendation.system.repository.UserFavoritesRepository;
import kg.megacom.Recommendation.system.Recommendation.system.services.UserFavoritesServices;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserFavoritesServicesImpl implements UserFavoritesServices {
    private final UserFavoritesRepository repository;
    private final MusicRepository musicRepository;
    private final GenreRepository genreRepository;
    public UserFavoritesServicesImpl(UserFavoritesRepository repository, MusicRepository musicRepository, GenreRepository genreRepository) {
        this.repository = repository;
        this.musicRepository = musicRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public UserFavoritesDTO save(UserFavoritesDTO dto, int lang) {
        return UserFavoritesMapper.INSTANCE.toDto(repository.save(UserFavoritesMapper.INSTANCE.toEntity(dto)));
    }

    @Override
    public UserFavoritesDTO findById(Long id, int lang) {
        return UserFavoritesMapper.INSTANCE.toDto(repository.findById(id).orElseThrow(()->new RuntimeException("User favorites под таким id не найден")));
    }

    @Override
    public List<UserFavoritesDTO> findAll(int lang) {
        return UserFavoritesMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public List<UserFavorites> putThreeAuthors(Long id, List<Long> ids, int lang) {
        return null;
    }

    @Override
    public Set<Music> getRecommendation(Long id, int lang) {

        List<Music> musicFormUser = getMusicFromUser(id,lang);

        Set<Genre> genres = getGenreFromMusic(musicFormUser,lang);

        Set<Music> musics = getMusicFromGenre(genres,lang);

        return musics;

    }

    public List<Music> getMusicFromUser(Long userId, int lang) {
        List<Music> music = musicRepository.findByMusic(userId);

        if(music.isEmpty()){
            throw new RuntimeException("нет фаворитов");
        }
        return music;
    }
    public Set<Genre> getGenreFromMusic(List<Music> musics, int lang) {
        Set<Genre> genresOfMusic = new HashSet<>();
        for (Music music:musics) {
            Set<Genre> genres = genreRepository.findByGenre(music.getId());
            genresOfMusic.addAll(genres);
        }
        return genresOfMusic;
    }

    public Set<Music> getMusicFromGenre(Set<Genre> genres, int lang) {
        Set<Music> musics = new HashSet<>();
        for (Genre genre : genres) {
            List<Music> musicList = musicRepository.findMusicByGenre(genre.getId());
            musics.addAll(musicList);
        }
        return musics;
    }




}
