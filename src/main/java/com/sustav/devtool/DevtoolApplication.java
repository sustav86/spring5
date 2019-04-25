package com.sustav.devtool;

import com.sustav.devtool.dao.SequenceDao;
import com.sustav.devtool.entity.BannerLoader;
import com.sustav.devtool.entity.Product;
import com.sustav.devtool.entity.SequenceGenerator;
import com.sustav.devtool.entity.TerminatorQuoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DevtoolApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(DevtoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("appConfig.xml");
		contextXml.setParent(context);
//		contextXml.refresh();
//		contextXml.registerShutdownHook();
		String[] beanDefinitionNamesXml = contextXml.getBeanDefinitionNames();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();

//		by Name
//		SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());

//		by Type
//		SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());
//		System.out.println(sequenceGenerator.getSequence());

//		SequenceDao bean = context.getBean(SequenceDao.class);
//		System.out.println(bean.getNextValue("IT"));
//		System.out.println(bean.getNextValue("IT"));
//
//		Product battery = context.getBean("battery", Product.class);
//		Product disc = context.getBean("disc", Product.class);
//
//		System.out.println(battery);
//		System.out.println(disc);

//		BannerLoader bean = context.getBean(BannerLoader.class);

		TerminatorQuoter bean = contextXml.getBean(TerminatorQuoter.class);
		bean.sayQuote();
	}
}
