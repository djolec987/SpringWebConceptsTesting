/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.codecraft.springwebconceptstesting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author Djordje Cvetkovic <djolec987@gmail.com>
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "rs.codecraft.springwebconceptstesting.controller")
public class ApplicationContextConfig implements WebMvcConfigurer {
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver l_Resolver = new InternalResourceViewResolver();
        l_Resolver.setPrefix("/WEB-INF/view/");
        l_Resolver.setSuffix(".jsp");
        return l_Resolver;
    }

}
