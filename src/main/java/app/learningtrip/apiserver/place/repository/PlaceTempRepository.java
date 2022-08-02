package app.learningtrip.apiserver.place.repository;

import app.learningtrip.apiserver.place.entity.PlaceTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceTempRepository extends JpaRepository<PlaceTempEntity, Long> {
}
