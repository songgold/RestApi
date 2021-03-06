package RestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class RestApiApplication {

	@Bean
	public Random createRandom() {
		return new Random();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
				= SpringApplication.run(RestApiApplication.class, args);

//		GenerateIdService service = ctx.getBean(GenerateIdService.class);
//		System.out.println("====>" + service.counter);
//		service.counter ++;
//
//		GenerateIdService service2 = ctx.getBean(GenerateIdService.class);
//		System.out.println("====>" + service2.counter);
	}
}
