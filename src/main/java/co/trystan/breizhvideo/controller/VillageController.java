package co.trystan.breizhvideo.controller;

import co.trystan.breizhvideo.Village;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/breizhvideo")
public class VillageController {

    @CrossOrigin
    @GetMapping("/village/carquefou")
    ResponseEntity<Village> getVillage(){
        Village hello = new Village();
        hello.setName("Carquefou");
        hello.setPostCode("44470");
        return ResponseEntity.ok().body(hello);
    }

}
