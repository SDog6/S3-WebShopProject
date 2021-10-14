package project.classes.product_class.parent_class;


public class BasicProduct {
    private String name;
    private String brand;
    private double price;
    private int warranty;

    public BasicProduct(String name,String brand,double price,int warranty)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString()
    {
        return " Name:" + this.name +
                " Brand:" + this.brand +
                " Price" + this.price +
                " Warranty" + this.warranty;
    }


}
