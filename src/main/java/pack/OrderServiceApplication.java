package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {
	@GetMapping("/")
	public String hello() {
		System.out.println("OrderService:[test]");
		return "OrderService:[test]";
	}
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
