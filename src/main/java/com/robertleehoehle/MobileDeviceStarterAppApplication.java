package com.robertleehoehle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.robertleehoehle.beans.Cellphone;
import com.robertleehoehle.beans.Owner;
import com.robertleehoehle.controller.BeanConfiguration;
import com.robertleehoehle.repository.CellphoneRepository;

@SpringBootApplication
public class MobileDeviceStarterAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MobileDeviceStarterAppApplication.class, args);
		
	}
	
	@Autowired
	CellphoneRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Cellphone cp = appContext.getBean("cellphone", Cellphone.class);
		cp.setManufacturer("Samsung");
		cp.setModel("Galaxy S8");
		cp.setCost(400.00);
		repo.save(cp);
		
		
		Cellphone cp1 = new Cellphone("OnePlus", "7 Pro", 599.00);
		Owner o1 = new Owner("Rob Hoehle", "515-491-1212");
		cp1.setOwner(o1);
		repo.save(cp1);

		Cellphone cp2 = new Cellphone("Samsung", "Galaxy S8", 150.00);
		Owner o2 = new Owner("Caleb Hoehle", "515-123-1212");
		cp2.setOwner(o2);
		repo.save(cp2);

		
		List<Cellphone> allCellphones = repo.findAll();
		for(Cellphone phones: allCellphones) {
			System.out.println(phones.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}

}
