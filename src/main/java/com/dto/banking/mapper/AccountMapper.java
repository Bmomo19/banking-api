package com.dto.banking.mapper;

import com.dto.banking.dto.AccountDto;
import com.dto.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getAccountNumber(),
            accountDto.getBalance()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getAccountNumber(),
            account.getBalance()
        );
    }
}
