package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicGenreDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.MusicGenre;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class MusicGenreMapperImpl implements MusicGenreMapper {

    @Override
    public MusicGenre toEntity(MusicGenreDTO d) {
        if ( d == null ) {
            return null;
        }

        MusicGenre musicGenre = new MusicGenre();

        return musicGenre;
    }

    @Override
    public MusicGenreDTO toDto(MusicGenre e) {
        if ( e == null ) {
            return null;
        }

        MusicGenreDTO musicGenreDTO = new MusicGenreDTO();

        return musicGenreDTO;
    }

    @Override
    public List<MusicGenre> toEntities(List<MusicGenreDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<MusicGenre> list = new ArrayList<MusicGenre>( d.size() );
        for ( MusicGenreDTO musicGenreDTO : d ) {
            list.add( toEntity( musicGenreDTO ) );
        }

        return list;
    }

    @Override
    public List<MusicGenreDTO> toDtos(List<MusicGenre> e) {
        if ( e == null ) {
            return null;
        }

        List<MusicGenreDTO> list = new ArrayList<MusicGenreDTO>( e.size() );
        for ( MusicGenre musicGenre : e ) {
            list.add( toDto( musicGenre ) );
        }

        return list;
    }
}
