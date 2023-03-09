package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicAuthorDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.MusicAuthor;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class MusicAuthorMapperImpl implements MusicAuthorMapper {

    @Override
    public MusicAuthor toEntity(MusicAuthorDTO d) {
        if ( d == null ) {
            return null;
        }

        MusicAuthor musicAuthor = new MusicAuthor();

        return musicAuthor;
    }

    @Override
    public MusicAuthorDTO toDto(MusicAuthor e) {
        if ( e == null ) {
            return null;
        }

        MusicAuthorDTO musicAuthorDTO = new MusicAuthorDTO();

        return musicAuthorDTO;
    }

    @Override
    public List<MusicAuthor> toEntities(List<MusicAuthorDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<MusicAuthor> list = new ArrayList<MusicAuthor>( d.size() );
        for ( MusicAuthorDTO musicAuthorDTO : d ) {
            list.add( toEntity( musicAuthorDTO ) );
        }

        return list;
    }

    @Override
    public List<MusicAuthorDTO> toDtos(List<MusicAuthor> e) {
        if ( e == null ) {
            return null;
        }

        List<MusicAuthorDTO> list = new ArrayList<MusicAuthorDTO>( e.size() );
        for ( MusicAuthor musicAuthor : e ) {
            list.add( toDto( musicAuthor ) );
        }

        return list;
    }
}
