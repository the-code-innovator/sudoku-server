package com.thecodeinnovator.sudokuserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudokuServerApplication {

	// @Value("${spring.datasource.driver-class-name}")
	// private String driverClassName;

	// @Value("${spring.datasource.url}")
	// private String dataSourceURL;

	// @Value("${spring.datasource.username}")
	// private String dataSourceUserName;

	// @Value("${spring.datasource.password}")
	// private String dataSourcePassword;

	// @Value("${postgres.maximumpoolsize}")
	// private int maximumPoolSize;
	
	// @Value("${postgres.minimumidle}")
	// private int minimumIdle;

	public static void main(String[] args) {
		SpringApplication.run(SudokuServerApplication.class, args);
	}

	// @Bean
    // DataSource dataSource() {
	// 	HikariDataSource dataSource = new HikariDataSource();
	// 	dataSource.setMinimumIdle(this.minimumIdle);
	// 	dataSource.setMaximumPoolSize(this.maximumPoolSize);
	// 	dataSource.setDataSourceClassName(this.driverClassName);
	// 	dataSource.addDataSourceProperty("url", this.dataSourceURL);
	// 	dataSource.addDataSourceProperty("user", this.dataSourceUserName);
	// 	dataSource.addDataSourceProperty("password", this.dataSourcePassword);
	// 	return (DataSource) dataSource;
    // }
}
