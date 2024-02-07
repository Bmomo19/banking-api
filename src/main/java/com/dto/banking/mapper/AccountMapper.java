package com.dto.banking.mapper;

import com.dto.banking.dto.AccountDto;
import com.dto.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getAccountNumber(),
            accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getAccountNumber(),
            account.getBalance()
        );
        return accountDto;
    }
}
