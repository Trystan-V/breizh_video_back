package co.trystan.breizhvideo.service;

import co.trystan.breizhvideo.modele.Show;

import java.util.List;
import java.util.Optional;

public interface ShowService {

        Optional<Show> findById(Long id);
        List<Show> findAll(String search);
        Show insert(Show show);
        Show update(Long id, Show show);
        void delete(Long id);
    }