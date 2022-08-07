package app.learningtrip.apiserver.common.repository;

import app.learningtrip.apiserver.common.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
