package github.pedrozaz.springarchitecture.manufacturers.configuration;

import github.pedrozaz.springarchitecture.manufacturers.Motor;
import github.pedrozaz.springarchitecture.manufacturers.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManufacturesConfig {

    @Bean(name = "brushed")
    public Motor motorBrushed() {
        Motor motor = new Motor();
        motor.setHorses(120);
        motor.setCylinders(4);
        motor.setModel("Fast");
        motor.setLiters(2.0);
        motor.setType(MotorType.BRUSHED);
        return motor;
    }

    @Bean(name = "electric")
    public Motor motorElectric() {
        Motor motor = new Motor();
        motor.setHorses(110);
        motor.setCylinders(4);
        motor.setModel("FastX");
        motor.setLiters(1.4);
        motor.setType(MotorType.ELECTRIC);
        return motor;
    }

    @Bean(name = "turbo")
    public Motor motorTurbo() {
        Motor motor = new Motor();
        motor.setHorses(200);
        motor.setCylinders(4);
        motor.setModel("Turbo");
        motor.setLiters(1.5);
        motor.setType(MotorType.TURBO);
        return motor;
    }
}
