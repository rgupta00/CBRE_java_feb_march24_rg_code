package com.bankapp;

import com.bankapp.dto.AccountDto;
import com.bankapp.service.AccountService;
import com.bankapp.service.TransactionService;
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
import java.math.BigDecimal;

//Bean object whose life cycle is maintain by spring framework
//AccountService , AccountDao => Busness bean
//DataSource, jdbcTemplate, EntityMangerFactory bean => infra bean
@SpringBootApplication
public class BankappprojectApplication implements CommandLineRunner {

	@Autowired
	private TransactionService transactionService;

	public static void main(String[] args) {
		SpringApplication.run(BankappprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//String name, BigDecimal balance, String email, String phone
//		accountService.addAccount(new AccountDto("raj", BigDecimal.valueOf(1000),"raj@gmail.com","9958543978"));
//		accountService.addAccount(new AccountDto("ekta", BigDecimal.valueOf(1000),"ekta@gmail.com","9958543900"));
		//try the fund transfer
		//accountService.transfer(1,2,BigDecimal.valueOf(10));
		//accountService.deposit(1, BigDecimal.valueOf(20));
		//transactionService.withdraw(2, BigDecimal.valueOf(10));
	}
}
