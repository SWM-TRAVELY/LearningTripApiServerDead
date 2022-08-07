package app.learningtrip.apiserver.repository;

import app.learningtrip.apiserver.common.entity.Place;
import app.learningtrip.apiserver.common.repository.PlaceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlaceRepositoryTest {
    @Autowired
    PlaceRepository placeRepository;

    @Test
    public void save() {
        // given
        Place place = new Place();
        place.setName("place01");
        place.setType(1);
        place.setOverview("설명");

        place.setAddress("주소");
        place.setLatitude(0.01);
        place.setLongitude(0.03);

        place.setTel("전화");
        place.setInfo("문의 및 안내");

        place.setRestDate("쉬는날");
        place.setUseTime("이용시간");

        place.setParking("주차시간");
        place.setBabyCarriage(false);
        place.setPet(false);

        place.setBookTour(true);

        // when
        placeRepository.save(place);
    }

}
