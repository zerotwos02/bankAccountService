package com.ja.bankaccountservice.service;

import com.ja.bankaccountservice.dto.BankAccountRequestDTO;
import com.ja.bankaccountservice.dto.BankAccountResponseDTO;
import com.ja.bankaccountservice.entities.BankAccount;
import com.ja.bankaccountservice.enums.AccountType;
import com.ja.bankaccountservice.repositories.BankAccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository BankAccountRepository;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .type(bankAccountDTO.getType())
                .balance(bankAccountDTO.getBalance())
                .createdAt(new Date())
                .currency(bankAccountDTO.getCurrency())
                .build();
        BankAccount savedBankAccount = BankAccountRepository.save(bankAccount);
        BankAccountResponseDTO bankAccountResponseDTO = BankAccountResponseDTO.builder()
                .id(savedBankAccount.getId())
                .type(savedBankAccount.getType())
                .createdAt(savedBankAccount.getCreatedAt())
                .currency(savedBankAccount.getCurrency())
                .balance(savedBankAccount.getBalance())
                .build();
        return null;
    }
}
