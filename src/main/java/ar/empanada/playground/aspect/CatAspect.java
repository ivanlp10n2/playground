package ar.empanada.playground.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CatAspect {

	@Before("execution(* ar.empanada.playground.model.Cat.*(..) )")
	public void thisIsCat() {
		System.out.println("This is a cat and it does: ");
	}
	
	
	
}
