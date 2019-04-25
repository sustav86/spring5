package com.sustav.devtool.config;

import com.sustav.devtool.entity.BannerLoader;
import com.sustav.devtool.entity.Battery;
import com.sustav.devtool.entity.Disc;
import com.sustav.devtool.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource(value = "classpath:discounts.properties", ignoreResourceNotFound = true)
public class ShopConfiguration {

    @Value("classpath:banner.txt")
    private Resource banner;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

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

    @Bean
//    @Lazy
    public BannerLoader bannerLoader() {
        BannerLoader bl = new BannerLoader();
        bl.setBanner(banner);
        return bl;
    }
}
