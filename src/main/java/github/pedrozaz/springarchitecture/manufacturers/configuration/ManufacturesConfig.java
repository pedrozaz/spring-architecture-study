package github.pedrozaz.springarchitecture.manufacturers.configuration;

import github.pedrozaz.springarchitecture.manufacturers.Motor;
import github.pedrozaz.springarchitecture.manufacturers.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManufacturesConfig {

    @Bean
    public Motor motor() {
        Motor motor = new Motor();
        motor.setHorses(120);
        motor.setCylinders(4);
        motor.setModel("Fast");
        motor.setLiters(2.0);
        motor.setType(MotorType.BRUSHED);
        return motor;
    }
}
