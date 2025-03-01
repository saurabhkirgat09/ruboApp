package com.sksolutions.project.rubo.ruboApp.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private double balance;

    @OneToMany(mappedBy = "wallet")
    private List<WalletTransactions> walletTransactions;
}
