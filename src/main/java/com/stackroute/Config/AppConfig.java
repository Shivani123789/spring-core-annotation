package com.stackroute.Config;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//spring will search for the bean classes  from this package
//we are giving base package and spring will scan all subpackage also
@ComponentScan(basePackages="com.stackroute")
public class AppConfig {

}
