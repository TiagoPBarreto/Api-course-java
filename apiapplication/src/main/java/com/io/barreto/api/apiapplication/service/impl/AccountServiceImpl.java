package com.io.barreto.api.apiapplication.service.impl;

import com.io.barreto.api.apiapplication.model.Account;
import com.io.barreto.api.apiapplication.model.Role;
import com.io.barreto.api.apiapplication.repository.AccountRepository;
import com.io.barreto.api.apiapplication.repository.RoleRepository;
import com.io.barreto.api.apiapplication.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder encoder;

    @Override
    public Account createAccount(Account account) {
        account.setPassword(encoder.encode(account.getPassword()));
        Role role = roleRepository.findByName("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        account.setRoles(roles);
        return accountRepository.save(account);
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public List<Account> getAccount() {
        return accountRepository.findAll();
    }
}
