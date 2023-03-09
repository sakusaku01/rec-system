package kg.megacom.Recommendation.system.Recommendation.system.services;

import kg.megacom.Recommendation.system.Recommendation.system.model.dto.UserFavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.Music;
import kg.megacom.Recommendation.system.Recommendation.system.model.entity.UserFavorites;

import java.util.List;
import java.util.Set;

public interface UserFavoritesServices extends BaseServices<UserFavoritesDTO>{
    List<UserFavorites> putThreeAuthors(Long id, List<Long> ids, int lang);

    Set<Music> getRecommendation(Long id, int lang);
}
