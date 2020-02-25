package com.satan;

import com.satan.pojo.Department;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@SpringBootTest
class Springboot03WebApplicationTests {

	@Test
	void contextLoads() {
		int index=(int) (Math.round(Math.random()*4));
		System.out.println(index);


	}

}
