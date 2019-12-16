package ar.empanada.playground;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ar.empanada.playground.model.Cat;

@SpringBootApplication
@ComponentScan(basePackages = "ar.empanada.playground")
public class PlaygroundApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlaygroundApplication.class);
		context.getBean(Cat.class).meow();
		context.close();
	}

}
