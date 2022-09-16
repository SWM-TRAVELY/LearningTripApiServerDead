package app.learningtrip.apiserver.dummy_temp;

import app.learningtrip.apiserver.dummy_temp.AutoCompleteResponse;
import app.learningtrip.apiserver.dummy_temp.Course;
import app.learningtrip.apiserver.dummy_temp.NearbyPlaceResponse;
import app.learningtrip.apiserver.dummy_temp.Place;
import app.learningtrip.apiserver.dummy_temp.RecommendCourseResponse;
import app.learningtrip.apiserver.dummy_temp.RecommendPlaceResponse;
import app.learningtrip.apiserver.dummy_temp.SearchResultResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  public List<Place> createPlaceList(){
    List<Place> placeList = new ArrayList<Place>();

    placeList.add(new Place(1));
    placeList.add(new Place(2));
    placeList.add(new Place(3));
    placeList.add(new Place(4));

    return placeList;
  }

  public List<Course> createCourseList(){
    List<Course> courseList = new ArrayList<Course>();

    courseList.add(new Course(1));
    courseList.add(new Course(2));

    return courseList;
  }

  @GetMapping("place/recommend")
  public ResponseEntity<RecommendPlaceResponse> getRecommendPlace(){
    RecommendPlaceResponse recommendPlaceResponse = new RecommendPlaceResponse(createPlaceList());

    return ResponseEntity.ok().body(recommendPlaceResponse);
  }

  @GetMapping("course/recommend")
  public ResponseEntity<RecommendCourseResponse> getRecommendCourse(){
    RecommendCourseResponse recommendCourseResponse = new RecommendCourseResponse(createCourseList());

    return ResponseEntity.ok().body(recommendCourseResponse);
  }

  @GetMapping("nearby/{placeId}")
  public ResponseEntity<NearbyPlaceResponse> getNearbyPlace(@PathVariable("placeId") Long id){
    NearbyPlaceResponse nearbyPlaceResponse = new NearbyPlaceResponse(createPlaceList());

    return ResponseEntity.ok().body(nearbyPlaceResponse);
  }

  @GetMapping("autocomplete/{keyword}")
  public ResponseEntity<AutoCompleteResponse> autoComplete(@PathVariable("keyword") String keyword){
    AutoCompleteResponse autoCompleteResponse = new AutoCompleteResponse();

    return ResponseEntity.ok().body(autoCompleteResponse);
  }

  @GetMapping("result/{keyword}")
  public ResponseEntity<SearchResultResponse> getSearchResult(@PathVariable("keyword") String keyword){
    SearchResultResponse searchResultResponse = new SearchResultResponse();

    return ResponseEntity.ok().body(searchResultResponse);
  }
}
