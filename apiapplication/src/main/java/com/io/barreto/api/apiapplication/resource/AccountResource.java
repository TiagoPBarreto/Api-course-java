package com.io.barreto.api.apiapplication.resource;

import com.io.barreto.api.apiapplication.model.Account;
import com.io.barreto.api.apiapplication.model.Employee;
import com.io.barreto.api.apiapplication.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.io.barreto.api.apiapplication.resource.EmployeeResource.getLocation;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/accounts")
public class AccountResource {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account newAccount = accountService.createAccount(account);
        return ResponseEntity.created(getLocation(newAccount.getId().intValue())).body(newAccount);
    }

    @GetMapping
    public ResponseEntity<List<Account>>getAccount(){
        return ResponseEntity.ok(accountService.getAccount());
    }
}
