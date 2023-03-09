package kg.megacom.Recommendation.system.Recommendation.system.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
public class MusicAuthorDTO {
    Long id;
    MusicDTO musicId;
    AuthorDTO authorId;
    boolean isActive;
}
