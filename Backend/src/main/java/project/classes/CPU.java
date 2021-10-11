package project.classes;

import project.classes.SupportClasses.ProductInfo;

public class CPU {

    private ProductInfo basicinfo;
    private double clockspeed;
    private int powerconsum;
    private String socket;
    private int cores;
    private int threads;

    public CPU(ProductInfo basicinfo,double clockspeed,int powerconsum,String socket,int cores,int threads)
    {
        this.basicinfo = basicinfo;
        this.clockspeed = clockspeed;
        this.powerconsum = powerconsum;
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
    }

    public ProductInfo getBasicinfo() {
        return basicinfo;
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public int getPowerconsum() {
        return powerconsum;
    }

    public String getSocket() {
        return socket;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }
}
