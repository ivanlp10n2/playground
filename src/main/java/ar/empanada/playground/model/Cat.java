package ar.empanada.playground.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class Cat {
	
	@Getter
	@Setter
	private String name;
	private int age;
	
	public void meow() {
		System.out.println("meow");
	}

}
