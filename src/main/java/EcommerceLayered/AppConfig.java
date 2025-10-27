package EcommerceLayered;

import EcommerceLayered.Database.ProductDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("EcommerceLayered")
public class AppConfig {
    @Bean(initMethod = "connect",destroyMethod = "disconnect")
    public ProductDatabase database(){
        return new ProductDatabase();
    }
}
