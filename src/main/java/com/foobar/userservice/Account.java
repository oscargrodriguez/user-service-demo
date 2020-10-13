package com.foobar.userservice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String accountNumber;

    public Account() {
    }


    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(Integer id, String accountNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
    }
}

