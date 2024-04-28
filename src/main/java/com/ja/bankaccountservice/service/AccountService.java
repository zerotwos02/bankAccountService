package com.ja.bankaccountservice.service;

import com.ja.bankaccountservice.dto.BankAccountRequestDTO;
import com.ja.bankaccountservice.dto.BankAccountResponseDTO;
import com.ja.bankaccountservice. entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
