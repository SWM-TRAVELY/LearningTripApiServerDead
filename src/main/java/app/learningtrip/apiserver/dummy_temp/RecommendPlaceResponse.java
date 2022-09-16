package app.learningtrip.apiserver.dummy_temp;

import java.util.List;
import lombok.Data;

@Data
public class RecommendPlaceResponse {
  private List<Place> placeList;

  public RecommendPlaceResponse(List<Place> placeList) {
    this.placeList = placeList;
  }
}
