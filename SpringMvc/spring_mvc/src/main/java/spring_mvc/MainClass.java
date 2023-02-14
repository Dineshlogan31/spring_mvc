package spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainClass {
	
	@RequestMapping("hello")
	public void hello() {
		System.out.println("hey i am hello");
	}
	@RequestMapping("bye")
	public void bye() {
		System.out.println("hey i am Bye");
	}

}
