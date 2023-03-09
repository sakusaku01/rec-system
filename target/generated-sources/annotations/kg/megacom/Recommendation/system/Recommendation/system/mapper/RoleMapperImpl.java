package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.RoleDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Role;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role toEntity(RoleDTO d) {
        if ( d == null ) {
            return null;
        }

        Role role = new Role();

        return role;
    }

    @Override
    public RoleDTO toDto(Role e) {
        if ( e == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        return roleDTO;
    }

    @Override
    public List<Role> toEntities(List<RoleDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( d.size() );
        for ( RoleDTO roleDTO : d ) {
            list.add( toEntity( roleDTO ) );
        }

        return list;
    }

    @Override
    public List<RoleDTO> toDtos(List<Role> e) {
        if ( e == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( e.size() );
        for ( Role role : e ) {
            list.add( toDto( role ) );
        }

        return list;
    }
}
