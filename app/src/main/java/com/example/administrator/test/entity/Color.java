package com.example.administrator.test.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity

public class Color {
    @Id
    private long id;
    private int colorNum;
    private int red ;
    private int green;
    private int blue;
    @Generated(hash = 1745091699)
    public Color(long id, int colorNum, int red, int green, int blue) {
        this.id = id;
        this.colorNum = colorNum;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    @Generated(hash = 1499471665)
    public Color() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getColorNum() {
        return this.colorNum;
    }
    public void setColorNum(int colorNum) {
        this.colorNum = colorNum;
    }
    public int getRed() {
        return this.red;
    }
    public void setRed(int red) {
        this.red = red;
    }
    public int getGreen() {
        return this.green;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public int getBlue() {
        return this.blue;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }

}
