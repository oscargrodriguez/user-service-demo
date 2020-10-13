package com.foobar.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class AccountsListener {
    private static final Logger logger = LoggerFactory.getLogger(AccountsListener.class);

    AccountRepository accountRepository;

    public AccountsListener(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @StreamListener(AccountStreams.INPUT)
    public void handleAccounts(@Payload AccountEvent accountEvent) {
        logger.info("Received accountEvent: {}" + accountEvent);
        Account account = new Account(accountEvent.getAccountNumber());
        accountRepository.save(account);
    }
}
