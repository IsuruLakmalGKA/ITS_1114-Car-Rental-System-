package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Isuru Lakmal G K A
 * Date    : $(DATE)
 **/

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
