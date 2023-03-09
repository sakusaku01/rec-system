package kg.megacom.Recommendation.system.Recommendation.system.services;

import kg.megacom.Recommendation.system.Recommendation.system.model.dto.FavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.enums.LikeStatus;

public interface FavoritesServices extends BaseServices<FavoritesDTO>{
    String myFavorites(Long musicId, Long userId, LikeStatus likeStatus, int lang);
}
