package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.AlbumDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Album;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class AlbumMapperImpl implements AlbumMapper {

    @Override
    public Album toEntity(AlbumDTO d) {
        if ( d == null ) {
            return null;
        }

        Album album = new Album();

        return album;
    }

    @Override
    public AlbumDTO toDto(Album e) {
        if ( e == null ) {
            return null;
        }

        AlbumDTO albumDTO = new AlbumDTO();

        return albumDTO;
    }

    @Override
    public List<Album> toEntities(List<AlbumDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Album> list = new ArrayList<Album>( d.size() );
        for ( AlbumDTO albumDTO : d ) {
            list.add( toEntity( albumDTO ) );
        }

        return list;
    }

    @Override
    public List<AlbumDTO> toDtos(List<Album> e) {
        if ( e == null ) {
            return null;
        }

        List<AlbumDTO> list = new ArrayList<AlbumDTO>( e.size() );
        for ( Album album : e ) {
            list.add( toDto( album ) );
        }

        return list;
    }
}
