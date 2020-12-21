package co.trystan.breizhvideo.service;

import co.trystan.breizhvideo.modele.Show;
import co.trystan.breizhvideo.repository.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    private VillageRepository repository;


    
}
