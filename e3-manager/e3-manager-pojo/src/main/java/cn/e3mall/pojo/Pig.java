package cn.e3mall.pojo;

public class Pig {
    private Integer id;

    private String age;

    private String heat;

    private String heatrate;

    private Integer locationX;

    private Integer locationY;

    private Integer aexercise;

    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat == null ? null : heat.trim();
    }

    public String getHeatrate() {
        return heatrate;
    }

    public void setHeatrate(String heatrate) {
        this.heatrate = heatrate == null ? null : heatrate.trim();
    }

    public Integer getLocationX() {
        return locationX;
    }

    public void setLocationX(Integer locationX) {
        this.locationX = locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public void setLocationY(Integer locationY) {
        this.locationY = locationY;
    }

    public Integer getAexercise() {
        return aexercise;
    }

    public void setAexercise(Integer aexercise) {
        this.aexercise = aexercise;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}