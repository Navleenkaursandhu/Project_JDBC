package database.proj.demo;

import database.proj.demo.dao.UserDAO;
import database.proj.demo.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		//UserDAO dao
		UserDAO dao = context.getBean(UserDAO.class);
		dao.init();
		// dao.createTable();
		dao.addUser(new User(1,"Navleen", "Kaur"));
		dao.getAndPrintUser();
	}

}