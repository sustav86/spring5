package com.sustav.devtool.config;

import com.sustav.devtool.entity.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfiguration {

    @Bean(name = "seq")
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        sequenceGenerator.setPrefix("30");
        sequenceGenerator.setInitial(8888);
        sequenceGenerator.setSuffix("A");

        return sequenceGenerator;
    }
}
