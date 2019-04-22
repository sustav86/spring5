package com.sustav.devtool;

import com.sustav.devtool.entity.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DevtoolApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(DevtoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beanDefinitionNames = context.getBeanDefinitionNames();

//		by Name
//		SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());

//		by Type
		SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());
	}
}
