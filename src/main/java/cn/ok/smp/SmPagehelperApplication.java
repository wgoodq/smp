package cn.ok.smp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@EnableScheduling
public class SmPagehelperApplication {

	public static void main(String[] args) {

		SpringApplication.run(SmPagehelperApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "redirect:User";
	}
}

