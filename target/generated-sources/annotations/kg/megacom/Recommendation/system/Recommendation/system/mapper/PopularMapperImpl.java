package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.ArrayList;
import java.util.List;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.PopularDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Popular;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T00:40:28+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
*/
public class PopularMapperImpl implements PopularMapper {

    @Override
    public Popular toEntity(PopularDTO d) {
        if ( d == null ) {
            return null;
        }

        Popular popular = new Popular();

        return popular;
    }

    @Override
    public PopularDTO toDto(Popular e) {
        if ( e == null ) {
            return null;
        }

        PopularDTO popularDTO = new PopularDTO();

        return popularDTO;
    }

    @Override
    public List<Popular> toEntities(List<PopularDTO> d) {
        if ( d == null ) {
            return null;
        }

        List<Popular> list = new ArrayList<Popular>( d.size() );
        for ( PopularDTO popularDTO : d ) {
            list.add( toEntity( popularDTO ) );
        }

        return list;
    }

    @Override
    public List<PopularDTO> toDtos(List<Popular> e) {
        if ( e == null ) {
            return null;
        }

        List<PopularDTO> list = new ArrayList<PopularDTO>( e.size() );
        for ( Popular popular : e ) {
            list.add( toDto( popular ) );
        }

        return list;
    }
}
