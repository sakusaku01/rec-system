package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.UserFavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.UserFavorites;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class UserFavoritesMapperImpl implements UserFavoritesMapper {

    @Override
    public UserFavorites toEntity(UserFavoritesDTO d) {
        if ( d == null ) {
            return null;
        }

        UserFavorites userFavorites = new UserFavorites();

        return userFavorites;
    }

    @Override
    public UserFavoritesDTO toDto(UserFavorites e) {
        if ( e == null ) {
            return null;
        }

        UserFavoritesDTO userFavoritesDTO = new UserFavoritesDTO();

        return userFavoritesDTO;
    }

    @Override
    public List<UserFavorites> toEntities(List<UserFavoritesDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<UserFavorites> list = new ArrayList<UserFavorites>( d.size() );
        for ( UserFavoritesDTO userFavoritesDTO : d ) {
            list.add( toEntity( userFavoritesDTO ) );
        }

        return list;
    }

    @Override
    public List<UserFavoritesDTO> toDtos(List<UserFavorites> e) {
        if ( e == null ) {
            return null;
        }

        List<UserFavoritesDTO> list = new ArrayList<UserFavoritesDTO>( e.size() );
        for ( UserFavorites userFavorites : e ) {
            list.add( toDto( userFavorites ) );
        }

        return list;
    }
}
