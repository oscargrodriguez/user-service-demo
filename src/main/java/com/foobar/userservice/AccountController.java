package com.foobar.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("")
    public List<Account> getAccount() {
        return accountRepository.findAll();
    }
}
