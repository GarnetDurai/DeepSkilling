package com.library.demo;
import java.util.List;
import com.library.demo.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.demo.Service.LoadService;
@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
        LoadService service = new LoadService();
        SpringApplication.run(DemoApplication.class, args);
        service.displayCountries();
	}

}
