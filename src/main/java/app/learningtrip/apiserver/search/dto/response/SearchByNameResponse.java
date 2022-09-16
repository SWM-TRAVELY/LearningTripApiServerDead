package app.learningtrip.apiserver.search.dto.response;

import app.learningtrip.apiserver.search.dto.PlaceSearchResult;
import lombok.Data;

import java.util.List;

@Data
public class SearchByNameResponse {
    private List<PlaceSearchResult> placeSearchResults;
}
