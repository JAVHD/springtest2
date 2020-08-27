package com.bear.springtest2.bean;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/27 下午3:26
 * Description:
 */

public class Man {

    private Float height;
    private String district;
    private String profession;

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getHeight() {
        return height;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
