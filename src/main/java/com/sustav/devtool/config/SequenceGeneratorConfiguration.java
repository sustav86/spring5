package com.sustav.devtool.config;

import com.sustav.devtool.entity.PrefixGenerator;
import com.sustav.devtool.entity.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

//    @Autowired
//    @Value("#{datePrefixGenerator}")
    @Value("#{customPrefixGenerator}")
    private PrefixGenerator prefixGenerator;

    @Bean(name = "seq")
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setInitial(8888);
        sequenceGenerator.setSuffix("A");
        sequenceGenerator.setPrefixGenerator(prefixGenerator);

        return sequenceGenerator;
    }
}
