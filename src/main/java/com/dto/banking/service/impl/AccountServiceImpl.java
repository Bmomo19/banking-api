package com.dto.banking.service.impl;

import com.dto.banking.dto.AccountDto;
import com.dto.banking.entity.Account;
import com.dto.banking.mapper.AccountMapper;
import com.dto.banking.repository.AccountRepository;
import com.dto.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return null;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
