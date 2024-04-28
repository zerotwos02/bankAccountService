package com.ja.bankaccountservice;

import com.ja.bankaccountservice.entities.BankAccount;
import com.ja.bankaccountservice.enums.AccountType;
import com.ja.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }
@Bean
CommandLineRunner start(BankAccountRepository BankAccountRepository ){
        return args -> {
            for (int i= 0; i<10; i++){
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                        .balance(1000+Math.random()*90000)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                BankAccountRepository.save(bankAccount);
            }

        };

    }
}
