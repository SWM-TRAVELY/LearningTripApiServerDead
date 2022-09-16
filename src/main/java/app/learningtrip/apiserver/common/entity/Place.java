package app.learningtrip.apiserver.common.entity;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id", unique = true, nullable = false)
    private long placeId;
    @Column(length = 3, nullable = false)
    private int typeId;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(nullable = false)
    private String overview;

    @Column(length = 100, nullable = false)
    private String address;
    @Column(length = 20, nullable = false)
    private double latitude;
    @Column(length = 20, nullable = false)
    private double longitude;

    @Column(name = "image")
    private String image;

    @Column(length = 100)
    private String tel;
    @Column(length = 300)
    private String info;

    @Column(length = 200)
    private String restDate;
    @Column(length = 700)
    private String useTime;

    @Column(length = 300)
    private String parking;
    private boolean babyCarriage;
    private boolean pet;

    private boolean bookTour;

    public long getId() {
        return placeId;
    }

    public void setId(int id) {
        this.placeId = id;
    }

    public int getType() {
        return typeId;
    }

    public void setType(int type) {
        this.typeId = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getRestDate() {
        return restDate;
    }

    public void setRestDate(String restDate) {
        this.restDate = restDate;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public boolean isBabyCarriage() {
        return babyCarriage;
    }

    public void setBabyCarriage(boolean babyCarriage) {
        this.babyCarriage = babyCarriage;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public boolean isBookTour() {
        return bookTour;
    }

    public void setBookTour(boolean bookTour) {
        this.bookTour = bookTour;
    }

    public void print() {
        System.out.println("This is " + name);
    }
}
