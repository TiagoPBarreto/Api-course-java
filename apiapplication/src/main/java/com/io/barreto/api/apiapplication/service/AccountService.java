package com.io.barreto.api.apiapplication.service;

import com.io.barreto.api.apiapplication.model.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);
    Account findByUsername(String username);
    List<Account>getAccount();
}
