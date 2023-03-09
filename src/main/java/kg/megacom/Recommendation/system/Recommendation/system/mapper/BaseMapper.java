package kg.megacom.Recommendation.system.Recommendation.system.mapper;

import java.util.List;

public interface BaseMapper<E,D>{
    E toEntity(D d);
    D toDto(E e);

    List<E> toEntities(List<D> d);
    List<D> toDtos(List<E> e);
}
