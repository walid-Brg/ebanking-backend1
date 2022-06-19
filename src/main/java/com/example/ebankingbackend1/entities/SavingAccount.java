package com.example.ebankingbackend1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NonNull @NoArgsConstructor @AllArgsConstructor

public class SavingAccount extends BankAccount{
    private double interestRate;
}
