package kg.megacom.Recommendation.system.Recommendation.system.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_music_author")
public class MusicAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "music_id")
    Music musicId;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "autor_id")
    Author authorId;

    boolean isActive;
}
