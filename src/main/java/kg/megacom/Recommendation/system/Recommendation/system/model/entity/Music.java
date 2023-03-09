package kg.megacom.Recommendation.system.Recommendation.system.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "tb_music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String file;
    @Temporal(TemporalType.DATE)
    Date year;

    @Temporal(TemporalType.DATE)
    Date addDate;
    @Temporal(TemporalType.DATE)
    Date editDate;

    boolean isActive;
    Double duration;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    Album albumId;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "authorId")
    Set<MusicAuthor> authors;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "musicId")
    Set<MusicAuthor> musics;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "genreId")
    Set<MusicGenre> genres;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JsonManagedReference
    @OneToMany(mappedBy = "musicId")
    Set<MusicGenre> musicsGenre;

    @PrePersist
    protected void onCreate(){
        this.addDate = new Date();
        this.editDate = new Date();
    }

    

}
