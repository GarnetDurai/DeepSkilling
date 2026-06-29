package com.library.demo.Service;
import com.library.demo.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class LoadService {
    public void displayCountries(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        for(Country c : countries){
            System.out.println(c);
        }
    }
}
