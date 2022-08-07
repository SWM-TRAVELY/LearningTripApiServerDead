package app.learningtrip.apiserver.common.repository;

import app.learningtrip.apiserver.common.entity.Heritage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeritageRepository extends JpaRepository<Heritage, Integer> {
}
