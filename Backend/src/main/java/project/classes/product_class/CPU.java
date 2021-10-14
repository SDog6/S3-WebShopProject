package project.classes.product_class;

import project.classes.product_class.parent_class.BasicProduct;

public class CPU extends BasicProduct {

    private double clockspeed;
    private int powerconsum;
    private String socket;
    private int cores;
    private int threads;

    public CPU(String name,String brand,double price,int warranty,double clockspeed,int powerconsum,String socket,int cores,int threads)
    {
        super(name,brand,price,warranty);
        this.clockspeed = clockspeed;
        this.powerconsum = powerconsum;
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
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
