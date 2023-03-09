package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Music;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class MusicMapperImpl implements MusicMapper {

    @Override
    public Music toEntity(MusicDTO d) {
        if ( d == null ) {
            return null;
        }

        Music music = new Music();

        return music;
    }

    @Override
    public MusicDTO toDto(Music e) {
        if ( e == null ) {
            return null;
        }

        MusicDTO musicDTO = new MusicDTO();

        return musicDTO;
    }

    @Override
    public List<Music> toEntities(List<MusicDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Music> list = new ArrayList<Music>( d.size() );
        for ( MusicDTO musicDTO : d ) {
            list.add( toEntity( musicDTO ) );
        }

        return list;
    }

    @Override
    public List<MusicDTO> toDtos(List<Music> e) {
        if ( e == null ) {
            return null;
        }

        List<MusicDTO> list = new ArrayList<MusicDTO>( e.size() );
        for ( Music music : e ) {
            list.add( toDto( music ) );
        }

        return list;
    }
}
