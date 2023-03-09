package kg.megacom.Recommendation.system.Recommendation.system.services;

import kg.megacom.Recommendation.system.Recommendation.system.model.dto.MusicDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.response.MusicRepoResponse;

import java.util.List;

public interface MusicServices extends BaseServices<MusicDTO>{

    List<MusicRepoResponse> findResponse(String authorName, int lang);

    List<MusicRepoResponse>  findByName(String name, int lang);

    List<?> getFilter(String author, String music, String genre, int lang);
}
