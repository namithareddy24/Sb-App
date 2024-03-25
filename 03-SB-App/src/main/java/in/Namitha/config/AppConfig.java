package in.Namitha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.Namitha.AppSecurity.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig :: constructor");
	}
	@Bean
	public AppSecurity security() {
		System.out.println("bean method called..");
		AppSecurity security = new AppSecurity();
		return security;
	}
}
