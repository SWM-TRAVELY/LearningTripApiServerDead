package app.learningtrip.apiserver.place.controller;

import app.learningtrip.apiserver.place.dto.response.PlaceInfoResponse;
import app.learningtrip.apiserver.place.repository.PlaceTempRepository;
import app.learningtrip.apiserver.place.service.PlaceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/place")
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceTempRepository placeTempRepository;

    @GetMapping("info/{place_id}")
    public ResponseEntity<PlaceInfoResponse> info(@PathVariable("place_id") Long place_id){

        return ResponseEntity.ok().body(new PlaceInfoService(placeTempRepository).getPlaceInfo(place_id));
    }
}
