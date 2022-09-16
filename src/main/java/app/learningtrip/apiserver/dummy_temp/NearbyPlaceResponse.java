package app.learningtrip.apiserver.dummy_temp;

import java.util.List;
import lombok.Data;

@Data
public class NearbyPlaceResponse {
  private List<Place> placeList;

  public NearbyPlaceResponse(List<Place> placeList) {
    this.placeList = placeList;
  }
}
