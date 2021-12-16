package project.Models.product_class;

import project.Models.product_class.parent_class.BasicProduct;


public class GPU extends BasicProduct {

    private int clockspeed;
    private int vram;
    private int lenght;
    private int width;
    private int height;
    private int hdmiports;
    private int displayports;
    private int fans;

    public GPU(String name,String brand,double price,int warranty,String url, int count, int clockspeed, int vram, int lenght, int width, int height, int hdmiports, int displayports, int fans) {
        super(name,brand,price,warranty,url,count);
        this.clockspeed = clockspeed;
        this.vram = vram;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.hdmiports = hdmiports;
        this.displayports = displayports;
        this.fans = fans;
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
