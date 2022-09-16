package app.learningtrip.apiserver.dummy_temp;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Course {
  private long courseId;

  private String name;

  private String imageURL;

  private List<Place> placeList;

  public Course(long courseId, String name, String imageURL, List<Place> placeList) {
    this.courseId = courseId;
    this.name = name;
    this.imageURL = imageURL;
    this.placeList = placeList;
  }

  public Course(int courseId) {
    if(courseId == 1){
      this.courseId = courseId;
      this.name = "코스1";
      this.imageURL = "http://www.thepingpong.co.kr/news/photo/201711/3746_15394_5227.jpg";
      List<Place> placeList = new ArrayList<Place>();
      placeList.add(new Place(1));
      placeList.add(new Place(3));
      placeList.add(new Place(2));
      this.placeList = placeList;
    } else {
      this.courseId = courseId;
      this.name = "코스2";
      this.imageURL = "https://t1.daumcdn.net/cfile/tistory/2475813854614D1C22";
      List<Place> placeList = new ArrayList<Place>();
      placeList.add(new Place(2));
      placeList.add(new Place(4));
      placeList.add(new Place(3));
      this.placeList = placeList;
    }
  }
}
