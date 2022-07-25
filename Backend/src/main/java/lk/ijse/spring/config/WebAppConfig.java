package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Isuru Lakmal G K A
 * Date    : $(DATE)
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse")
@EnableWebMvc
public class WebAppConfig {
}
