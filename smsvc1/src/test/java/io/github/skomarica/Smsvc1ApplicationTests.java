package io.github.skomarica;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import io.github.skomarica.Smsvc1Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Smsvc1Application.class)
@WebAppConfiguration
public class Smsvc1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
