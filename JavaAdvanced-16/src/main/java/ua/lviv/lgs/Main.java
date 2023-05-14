package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

		StudentDao studentDao = context.getBean(StudentDao.class);
		
		studentDao.create(new Student(1, "Niko", 23));
		studentDao.create(new Student(2, "Ura", 21));
		studentDao.readAll().stream().forEach(System.out::println);
		System.out.println();
		
		studentDao.update(new Student(2, "Inna", 18));
		System.out.println(studentDao.readById(2));
		System.out.println();
				
		studentDao.delete(1);
		studentDao.readAll().stream().forEach(System.out::println);			
	}

}