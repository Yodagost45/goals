package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class DbConfig {
	private String USERNAME = "abc123"; //FIND OUT WHAT GOES HERE
	private String PASSWORD = "password"; // in ~/.my.cnf
	private String HOST = "127.0.0.1";
	private String PORT = "3306";
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://" + HOST + ":" + PORT + "/" + USERNAME);
		ds.setUsername(USERNAME);
		ds.setPassword(PASSWORD);
		return ds;
	}
}