package github.pedrozaz.springarchitecture.manufacturers.api;

import github.pedrozaz.springarchitecture.manufacturers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping("/cars")
public class TestFactoryController implements Serializable {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
        Car car = new HondaHRV(motor);
        return car.turnOn(key);
    }
}
