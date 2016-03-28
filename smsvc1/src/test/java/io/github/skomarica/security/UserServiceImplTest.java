package io.github.skomarica.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import io.github.skomarica.Smsvc1Application;
import io.github.skomarica.security.UserService;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Smsvc1Application.class)
@WebAppConfiguration
public class UserServiceImplTest {

	@Autowired
	UserService userService;

	@Test
	public void testGetDefaultUser() {
		Assert.assertEquals("admin", userService.getDefaultUser());
	}

}
