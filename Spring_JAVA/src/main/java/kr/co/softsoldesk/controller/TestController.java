package kr.co.softsoldesk.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test1")
	public String test1(Model model, Locale locale) {
	
		String a1=res.getMessage("aaa.a1", null, null);
		String b1=res.getMessage("bbb.b1", null, null);		
		//Chrome 자체에서 Reloadable등록
		String a3=res.getMessage("aaa.a3", null, locale);
		//{}부분에 셋팅
		Object[] args= {30, "김민주"};
		String a2=res.getMessage("aaa.a2", args, null);
		
		System.out.println("aaa.a1 : "+a1 );
		System.out.println("bbb.b1 : "+b1 );
		System.out.println("aaa.a2 : "+a2);
		//다국어 처리
		System.out.println("locale : "+locale);
		System.out.println("aaa.a3 : "+a3);
		
		model.addAttribute("args", args);  //jsp에 사용하기 위함
		return "test1";
		
	}
}