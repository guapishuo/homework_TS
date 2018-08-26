package entity;

public class Car {
    private int id;
    private String brand;
    private String name;
    private float price;

    public Car() {
    }

    public Car(int id, String brand, String name, float price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
