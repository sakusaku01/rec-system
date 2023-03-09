package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.UserEntityDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.UserEntity;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public UserEntity toEntity(UserEntityDTO d) {
        if ( d == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        return userEntity;
    }

    @Override
    public UserEntityDTO toDto(UserEntity e) {
        if ( e == null ) {
            return null;
        }

        UserEntityDTO userEntityDTO = new UserEntityDTO();

        return userEntityDTO;
    }

    @Override
    public List<UserEntity> toEntities(List<UserEntityDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<UserEntity> list = new ArrayList<UserEntity>( d.size() );
        for ( UserEntityDTO userEntityDTO : d ) {
            list.add( toEntity( userEntityDTO ) );
        }

        return list;
    }

    @Override
    public List<UserEntityDTO> toDtos(List<UserEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<UserEntityDTO> list = new ArrayList<UserEntityDTO>( e.size() );
        for ( UserEntity userEntity : e ) {
            list.add( toDto( userEntity ) );
        }

        return list;
    }
}
