package com.example.demo.configuration;

import com.example.demo.beans.SaySomethingConfigurableService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SaySomethingConfiguration {

    @Bean
    @Primary
    public SaySomethingConfigurableService saySomethingConfigurableService() {
        SaySomethingConfigurableService saySomethingConfigurableService = new SaySomethingConfigurableService();
        saySomethingConfigurableService.SetWhatToSay("Goodbye");
        return saySomethingConfigurableService;
    }
}
