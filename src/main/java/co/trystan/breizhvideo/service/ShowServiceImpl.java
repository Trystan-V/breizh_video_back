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


    @Override
    public Optional<Show> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Show> findAll(String search) {
        return null;
    }

    @Override
    public Show insert(Show show) {
        return null;
    }

    @Override
    public Show update(Long id, Show show) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
