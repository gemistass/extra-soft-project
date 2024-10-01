package com.intrasoft.extrahardexercise.account;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class AccountController {
    @Autowired
    AccountReposiroty accountRepository;

    @GetMapping("/accounts/{id}")
    Account one(@PathVariable int id) {

        return accountRepository.findById(id).get();
    }
}
