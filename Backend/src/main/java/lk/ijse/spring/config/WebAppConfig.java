package lk.ijse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Isuru Lakmal G K A
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
