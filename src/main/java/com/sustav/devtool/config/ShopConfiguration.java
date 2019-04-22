package com.sustav.devtool.config;

import com.sustav.devtool.entity.Battery;
import com.sustav.devtool.entity.Disc;
import com.sustav.devtool.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    @Bean
    public Product battery() {
        Battery battery = new Battery("AAA", 2.5);
        battery.setRechargeable(true);

        return battery;
    }

    @Bean
    public Disc disc() {
        Disc disc = new Disc("AAA", 2.5);
        disc.setCapacity(true);

        return disc;
    }
}
