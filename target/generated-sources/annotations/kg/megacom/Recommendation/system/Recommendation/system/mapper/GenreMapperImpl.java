package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.GenreDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Genre;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class GenreMapperImpl implements GenreMapper {

    @Override
    public Genre toEntity(GenreDTO d) {
        if ( d == null ) {
            return null;
        }

        Genre genre = new Genre();

        return genre;
    }

    @Override
    public GenreDTO toDto(Genre e) {
        if ( e == null ) {
            return null;
        }

        GenreDTO genreDTO = new GenreDTO();

        return genreDTO;
    }

    @Override
    public List<Genre> toEntities(List<GenreDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Genre> list = new ArrayList<Genre>( d.size() );
        for ( GenreDTO genreDTO : d ) {
            list.add( toEntity( genreDTO ) );
        }

        return list;
    }

    @Override
    public List<GenreDTO> toDtos(List<Genre> e) {
        if ( e == null ) {
            return null;
        }

        List<GenreDTO> list = new ArrayList<GenreDTO>( e.size() );
        for ( Genre genre : e ) {
            list.add( toDto( genre ) );
        }

        return list;
    }
}
