package app.learningtrip.apiserver.search.service;

import app.learningtrip.apiserver.common.repository.PlaceRepository;
import app.learningtrip.apiserver.search.dto.PlaceSearchResult;
import app.learningtrip.apiserver.search.dto.response.SearchByNameResponse;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class SearchServiceImpl implements SearchService{
    private final PlaceRepository placeRepository;

    public SearchServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public SearchByNameResponse searchByName(String name) {
        List<PlaceSearchResult> placeSearchResult = placeRepository.findAllByNameLike("%"+name+"%").orElseThrow(null);

        SearchByNameResponse searchByNameResponse = new SearchByNameResponse();

        // 거리순? 가나다순? 정렬 로직

        searchByNameResponse.setPlaceSearchResults(placeSearchResult);

        return searchByNameResponse;
    }
}
