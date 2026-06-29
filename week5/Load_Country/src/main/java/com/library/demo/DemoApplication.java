package com.library.demo;
import java.util.List;
import com.library.demo.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {
    public static void displayCountries(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        for(Country c : countries){
            System.out.println(c);
        }
    }
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        displayCountries();
	}

}
