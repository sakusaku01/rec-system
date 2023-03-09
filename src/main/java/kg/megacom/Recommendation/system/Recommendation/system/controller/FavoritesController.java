package kg.megacom.Recommendation.system.Recommendation.system.controller;

import io.swagger.annotations.Api;
import kg.megacom.Recommendation.system.Recommendation.system.model.dto.FavoritesDTO;
import kg.megacom.Recommendation.system.Recommendation.system.model.enums.LikeStatus;
import kg.megacom.Recommendation.system.Recommendation.system.services.FavoritesServices;
import kg.megacom.Recommendation.system.Recommendation.system.swaggerconfig.Swagger2Config;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fav")
@Api(tags = Swagger2Config.Favorites)
public class FavoritesController {

    private final FavoritesServices services;

    public FavoritesController(FavoritesServices services) {
        this.services = services;
    }

    @PostMapping("/create/favorites")
    public ResponseEntity<?> myFavorites(@RequestParam Long musicId,
                                         @RequestParam Long userId,
                                         @RequestParam LikeStatus likeStatus,
                                         int lang){
        try {
            return ResponseEntity.ok(services.myFavorites(musicId,userId,likeStatus,lang));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody FavoritesDTO dto, int lang){
        try {
            return ResponseEntity.ok(services.save(dto,lang));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/get")
    public ResponseEntity<?> findById(@RequestParam Long id,int lang){
        try {
            return ResponseEntity.ok(services.findById(id,lang));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/get/all")
    public ResponseEntity<?> findAll(@RequestParam int lang){
        try {
            return ResponseEntity.ok(services.findAll(lang));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
