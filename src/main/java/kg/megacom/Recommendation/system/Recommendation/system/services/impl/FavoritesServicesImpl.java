package kg.megacom.Recommendation.system.Recommendation.system.services.impl;

import kg.megacom.Recommendation.system.Recommendation.system.model.dto.FavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.UserEntityDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.enums.LikeStatus;
import kg.megacom.Recommendation.system.Recommendation.system.services.FavoritesServices;
import kg.megacom.Recommendation.system.Recommendation.system.services.MusicServices;
import kg.megacom.Recommendation.system.Recommendation.system.services.UserEntityServices;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FavoritesServicesImpl implements FavoritesServices {

    private final MusicServices services;
    private final UserEntityServices userServices;

    public FavoritesServicesImpl(MusicServices services, UserEntityServices userServices) {
        this.services = services;
        this.userServices = userServices;
    }

    @Override
    public FavoritesDTO save(FavoritesDTO favoritesDTO, int lang) {
        return null;
    }

    @Override
    public FavoritesDTO findById(Long id, int lang) {
        return null;
    }

    @Override
    public List<FavoritesDTO> findAll(int lang) {
        return null;
    }

    @Override
    public String myFavorites(Long musicId, Long userId, LikeStatus likeStatus, int lang) {

        MusicDTO dto = services.findById(musicId,lang);
        UserEntityDTO user = userServices.findById(userId,lang);

        FavoritesDTO favoritesDTO = new FavoritesDTO();
        favoritesDTO.setStatus(likeStatus);
        favoritesDTO.setMusicId(dto);
        favoritesDTO.setUserId(user);
        favoritesDTO.setDownloadUrl(dto.getFile());
        save(favoritesDTO,lang);

        return favoritesDTO.getDownloadUrl();
    }
}
