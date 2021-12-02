package project.DTO.product_class;

import project.DTO.product_class.parent_class.BasicProduct;

import javax.persistence.*;

@Entity
@Table(name = "cpu")
public class CPU extends BasicProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "clockspeed")
    private double clockspeed;
    @Column(name = "powerconsum")
    private int powerconsum;
    @Column(name = "socket")
    private String socket;
    @Column(name = "cores")
    private int cores;
    @Column(name = "threads")
    private int threads;

    public CPU(String name,String brand,double price,int warranty,String url,int count,double clockspeed,int powerconsum,String socket,int cores,int threads)
    {
        super(name,brand,price,warranty,url,count);
        this.clockspeed = clockspeed;
        this.powerconsum = powerconsum;
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
    }

    public CPU(int s)
    {
        this.cores = s;
    }

    public CPU() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClockspeed(double clockspeed) {
        this.clockspeed = clockspeed;
    }

    public void setPowerconsum(int powerconsum) {
        this.powerconsum = powerconsum;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setThreads(int threads) {
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

