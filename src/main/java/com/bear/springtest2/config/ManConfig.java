package com.bear.springtest2.config;

import com.bear.springtest2.bean.Man;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/27 下午3:52
 * Description:
 */

@Configuration
public class ManConfig {

    @Bean
    public Man man() //相当于在xml创建id为man的bean
    {
        //return new Man().setDistrict("beijing");
        Man man = new Man();
        man.setDistrict("beijing");
        man.setHeight(160f);
        return man;
    }
}
