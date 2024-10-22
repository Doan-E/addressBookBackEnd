package EE308FZ.Assignment1AddressBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = "EE308FZ.Assignment1AddressBook.model")

public class Assignment1AddressBookApplication {
	public static void main(String[] args) {
		SpringApplication.run(Assignment1AddressBookApplication.class, args);
	}

}
@RestController
class HomeController {
    @GetMapping("/")
    public String home() {
        return "欢迎使用地址簿 API！";
    }
}