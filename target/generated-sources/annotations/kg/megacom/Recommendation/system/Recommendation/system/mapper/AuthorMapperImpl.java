package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.AuthorDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Author;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public Author toEntity(AuthorDTO d) {
        if ( d == null ) {
            return null;
        }

        Author author = new Author();

        return author;
    }

    @Override
    public AuthorDTO toDto(Author e) {
        if ( e == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        return authorDTO;
    }

    @Override
    public List<Author> toEntities(List<AuthorDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Author> list = new ArrayList<Author>( d.size() );
        for ( AuthorDTO authorDTO : d ) {
            list.add( toEntity( authorDTO ) );
        }

        return list;
    }

    @Override
    public List<AuthorDTO> toDtos(List<Author> e) {
        if ( e == null ) {
            return null;
        }

        List<AuthorDTO> list = new ArrayList<AuthorDTO>( e.size() );
        for ( Author author : e ) {
            list.add( toDto( author ) );
        }

        return list;
    }
}
