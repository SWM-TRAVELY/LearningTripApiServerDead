package app.learningtrip.apiserver.common.repository;

import app.learningtrip.apiserver.common.entity.Place;
import app.learningtrip.apiserver.search.dto.PlaceSearchResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
//    List<Place> findAllByNameLike(String name);

    @Query("SELECT new app.learningtrip.apiserver.search.dto.PlaceSearchResult(" +
            "place.placeId, place.name, place.typeId, place.image) FROM Place place")
    Optional<List<PlaceSearchResult>> findAllByNameLike(String name);

}
