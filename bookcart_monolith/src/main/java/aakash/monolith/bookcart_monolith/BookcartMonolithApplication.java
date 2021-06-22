package aakash.monolith.bookcart_monolith;

import aakash.monolith.bookcart_monolith.dao.model.UserDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookcartMonolithApplication {

	public static void main(String[] args) {

		UserDetails userDetails = new UserDetails();
		userDetails.getId();
		SpringApplication.run(BookcartMonolithApplication.class, args);
	}

}
