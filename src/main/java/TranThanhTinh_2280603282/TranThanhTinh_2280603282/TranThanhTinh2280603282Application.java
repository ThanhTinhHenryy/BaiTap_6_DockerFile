package TranThanhTinh_2280603282.TranThanhTinh_2280603282;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TranThanhTinh2280603282Application {

	public static void main(String[] args) {
		SpringApplication.run(TranThanhTinh2280603282Application.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Hello World");
		return "index";
	}

}
