package project.classes.product_class;

import project.classes.product_class.parent_class.ProductInfo;

public class GPU {

    private ProductInfo basicinfo;
    private int clockspeed;
    private int vram;
    private int lenght;
    private int width;
    private int height;
    private int hdmiports;
    private int displayports;
    private int fans;

    public GPU(ProductInfo basicinfo, int clockspeed, int vram, int lenght, int width, int height, int hdmiports, int displayports, int fans) {
        this.basicinfo = basicinfo;
        this.clockspeed = clockspeed;
        this.vram = vram;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.hdmiports = hdmiports;
        this.displayports = displayports;
        this.fans = fans;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public int getClockspeed() {
        return clockspeed;
    }

    public int getVram() {
        return vram;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getHdmiports() {
        return hdmiports;
    }

    public int getDisplayports() {
        return displayports;
    }

    public int getFans() {
        return fans;
    }
}
