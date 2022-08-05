package app.learningtrip.apiserver.place.domain;

import javax.persistence.*;

@Entity
@Table
public class Heritage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "heritage_id", unique = true, nullable = false)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 12, nullable = false)
    private String type;
    @Column(nullable = false)
    private String explain;

    @Column(length = 110, nullable = false)
    private String address;
    @Column(length = 20, nullable = false)
    private double latitude;
    @Column(length = 20, nullable = false)
    private double longitude;

    @Column(length = 15, nullable = false)
    private String cat1;
    @Column(length = 15, nullable = false)
    private String cat2;
    @Column(length = 15, nullable = false)
    private String cat3;
    @Column(length = 15, nullable = false)
    private String cat4;

    @Column(length = 100, nullable = false)
    private String period;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "place_id")
    public Place place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
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

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public String getCat3() {
        return cat3;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    public String getCat4() {
        return cat4;
    }

    public void setCat4(String cat4) {
        this.cat4 = cat4;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
