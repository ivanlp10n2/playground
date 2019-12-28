package ar.empanada.playground.service;

import ar.empanada.playground.model.Cat;

public class CatService {
	
	public boolean isCat(Object o) {
		return o instanceof Cat;
	}

}
