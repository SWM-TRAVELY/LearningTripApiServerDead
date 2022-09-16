package app.learningtrip.apiserver.search.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlaceSearchResult {
    private long placeId;

    private String name;

    private int typeId;

    private String image;

//    위도 경도
}
