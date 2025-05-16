package github.pedrozaz.springarchitecture.manufacturers;

import java.awt.*;

public class HondaHRV extends Car {

    public HondaHRV(Motor motor) {
        super(motor);
        setModel("HRV");
        setColor(Color.BLACK);
        setManufacturers(Manufacturers.HONDA);
    }
}
