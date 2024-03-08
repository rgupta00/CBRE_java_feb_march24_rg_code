package com.bankapp;

import com.bankapp.config.DbProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
//Bean object whose life cycle is maintain by spring framework
//AccountService , AccountDao => Busness bean
//DataSource, jdbcTemplate, EntityMangerFactory bean => infra bean
@EnableConfigurationProperties(DbProp.class)
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
	DataSourceTransactionManagerAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
public class BankappprojectApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(BankappprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		if(dataSource!=null){
			System.out.println("ds is created...");
		}
		if(jdbcTemplate!=null){
			System.out.println("jdbcTemplate is created...");
		}
	}
}
