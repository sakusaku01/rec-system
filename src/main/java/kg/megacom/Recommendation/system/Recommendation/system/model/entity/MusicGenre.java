package kg.megacom.Recommendation.system.Recommendation.system.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_music_genre")
public class MusicGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Temporal(TemporalType.DATE)
    Date addDate;
    @Temporal(TemporalType.DATE)
    Date editDate;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "music_id")
    Music musicId;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "genre_id")
    Genre genreId;

    @PrePersist
    protected void onCreate(){
        this.addDate = new Date();
        this.editDate = new Date();
    }
}
