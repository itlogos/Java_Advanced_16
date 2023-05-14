package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.StudentDao;
import ua.lviv.lgs.StudentDaoImpl;

@Configuration
public class StudentDaoConfig {

	@Bean
	StudentDao studentDao() {
		return new StudentDaoImpl();
	}
}
