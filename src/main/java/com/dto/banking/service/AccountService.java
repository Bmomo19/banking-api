package com.dto.banking.service;

import com.dto.banking.dto.AccountDto;
import com.dto.banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(Account account);
}
