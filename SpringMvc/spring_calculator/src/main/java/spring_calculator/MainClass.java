package spring_calculator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainClass {
	@RequestMapping("add")
	public ModelAndView addition(@RequestParam double num1,@RequestParam int num2) {
		ModelAndView andView=new ModelAndView();
		andView.addObject("x",num1);
		andView.addObject("y",num2);
		andView.addObject("Msg","Addition");
		andView.addObject("result",num1+num2);
		andView.setViewName("Result.jsp");
		return andView;
	}
	@RequestMapping("sub")
	public ModelAndView substraction(@RequestParam double num1,@RequestParam int num2) {
		ModelAndView andView=new ModelAndView();
		andView.addObject("x",num1);
		andView.addObject("y",num2);
		andView.addObject("Msg","Substarction");
		andView.addObject("result",num1-num2);
		andView.setViewName("Result.jsp");
		return andView;
	}
	@RequestMapping("mul")
	public ModelAndView multiplication(@RequestParam double num1,@RequestParam int num2) {
		ModelAndView andView=new ModelAndView();
		andView.addObject("x",num1);
		andView.addObject("y",num2);
		andView.addObject("Msg","Multiplication");
		andView.addObject("result",num1*num2);
		andView.setViewName("Result.jsp");
		return andView;
	}
		
	
	@RequestMapping("div")
	public ModelAndView division(@RequestParam double num1,@RequestParam int num2) {
		ModelAndView andView=new ModelAndView();
		andView.addObject("x",num1);
		andView.addObject("y",num2);
		andView.addObject("Msg","Division");
		andView.addObject("result",num1/num2);
		andView.setViewName("Result.jsp");
		return andView;
	}
	

}
