package com.example.ebankingbackend1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor

public class CurrentAccount extends BankAccount{
    private double overdraft;
}
