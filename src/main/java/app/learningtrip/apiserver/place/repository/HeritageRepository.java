package app.learningtrip.apiserver.place.repository;

import app.learningtrip.apiserver.place.domain.Heritage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeritageRepository extends JpaRepository<Heritage, Integer> {
}
