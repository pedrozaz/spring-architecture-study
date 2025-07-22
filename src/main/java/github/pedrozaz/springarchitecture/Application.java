package github.pedrozaz.springarchitecture;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		builder.profiles("production");
		builder.bannerMode(Banner.Mode.OFF);
		builder.lazyInitialization(false);

		builder.run(args);

		//Initialized application context
		ConfigurableApplicationContext applicationContext = builder.context();
		//var productRepository = applicationContext.getBean("productRepository");

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String appName = environment.getProperty("spring.application.name");

		System.out.println("Application name: " + appName);
		System.out.println(applicationContext.getBean(ValueExample.class).print());
	}
}
