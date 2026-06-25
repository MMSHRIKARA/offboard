package com.capg.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class Ale {
	@Autowired
	Laptop lap;
	public void code() {
		lap.compile();  
	}

}
