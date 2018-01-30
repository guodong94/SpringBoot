package com.gd;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


	@SpringBootApplication
	@PropertySource(value={"classpath:jdbc.properties"})
	@ComponentScan(basePackages = "com.gd")
	@Configuration
	public class JpaTestApplication {
			@Value("${jdbc.url}")
			private String jdbcUrl;
			@Value("${jdbc.driverClassName}")
			private String jdbcDriverClassName;
			@Value("${jdbc.username}")
			private String jdbcUsername;
			@Value("${jdbc.password}")
			private String jdbcPassword;

			@Bean(destroyMethod = "close")
			public BoneCPDataSource dataSource(){
				BoneCPDataSource boneCPDataSource=new BoneCPDataSource();
				boneCPDataSource.setDriverClass(jdbcDriverClassName);
				boneCPDataSource.setJdbcUrl(jdbcUrl);
				boneCPDataSource.setPassword(jdbcPassword);
				boneCPDataSource.setUsername(jdbcUsername);
				boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
				boneCPDataSource.setIdleMaxAgeInMinutes(30);
				boneCPDataSource.setMaxConnectionsPerPartition(100);
				boneCPDataSource.setMinConnectionsPerPartition(5);
				return boneCPDataSource;
			}

		public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}
}
