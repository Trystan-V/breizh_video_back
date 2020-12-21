package co.trystan.breizhvideo.service;


import co.trystan.breizhvideo.modele.Village;

import java.util.List;
import java.util.Optional;



public interface VillageService {
    Optional<Village> findById(Long id);
    List<Village> findAll(String search);
    Village insert(Village village);
    Village update(Long id, Village village);
    void delete(Long id);
}

