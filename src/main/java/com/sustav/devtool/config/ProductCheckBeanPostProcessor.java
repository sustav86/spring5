package com.sustav.devtool.config;

import com.sustav.devtool.entity.BannerLoader;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProductCheckBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BannerLoader) {
            String productName = ((BannerLoader) bean).getName();
            System.out.println("In ProductCheckBeanPostProcessor. postProcessBeforeInitialization, processing Product: " + productName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BannerLoader) {
            String productName = ((BannerLoader) bean).getName();
            System.out.println("In ProductCheckBeanPostProcessor. postProcessAfterInitialization, processing Product: " + productName);
        }
        return bean;
    }
}
