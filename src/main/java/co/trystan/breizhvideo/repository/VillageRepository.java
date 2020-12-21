package co.trystan.breizhvideo.repository;

import co.trystan.breizhvideo.modele.Village;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VillageRepository extends JpaRepository<Village, Long> {
    public List<Village> findByNameContaining(String name);
}