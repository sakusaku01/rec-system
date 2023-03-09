package kg.megacom.Recommendation.system.Recommendation.system.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    @Temporal(TemporalType.DATE)
    Date addDate;
    @Temporal(TemporalType.DATE)
    Date editDate;
    boolean isActive;
    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "musicId")
    Set<MusicGenre> musics;

    @PrePersist
    protected void onCreate(){
        this.addDate = new Date();
        this.editDate = new Date();
    }
}
