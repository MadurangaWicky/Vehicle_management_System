package com.training.vehiclesys.configs;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
//Above is for add the third party modelmapper into a bean. because then we can use it with @Autowired. To use like above, it need to add @Configuration annotation as well.