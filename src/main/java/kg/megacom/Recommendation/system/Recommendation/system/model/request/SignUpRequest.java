package kg.megacom.Recommendation.system.Recommendation.system.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUpRequest {
    String username;
    String email;
    String password;
    Set<String> roles;
    String gender;
    @JsonIgnore
    boolean isActive;
    int age;

}
