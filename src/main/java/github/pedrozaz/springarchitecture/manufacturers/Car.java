package github.pedrozaz.springarchitecture.manufacturers;

import java.awt.*;

public class Car {
    private String model;
    private Color color;
    private Motor motor;
    private Manufacturers manufacturers;

    public Car(Motor motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturers manufacturers) {
        this.manufacturers = manufacturers;
    }

    public CarStatus turnOn(Key key) {
        if(key.getManufacturers() != this.manufacturers) {
            return new CarStatus("Access denied.");
        }
        return new CarStatus("Car started. Motor: " + motor);
    }
}
