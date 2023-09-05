package de.telran.bank.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class AccountController {

    private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);
    private AccountStorage accountStorage;

    public AccountController(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    @PostMapping(value = "/account", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void createAccount(@RequestBody Account account) {
        accountStorage.save(account);
        LOG.info("Received account = {}", account);
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable UUID id) {
        return accountStorage.get(id);
    }
}
