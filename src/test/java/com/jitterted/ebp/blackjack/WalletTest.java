package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

    @Test
    public void newWalletIsEmpty() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.isEmpty())
                .isTrue();
    }

    @Test
    public void newWalletWhenAddMoneyThenIsNotEmpty() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(1);

        assertThat(wallet.isEmpty())
                .isFalse();
    }

    @Test
    public void newWalletHasZeroBalance() throws Exception {
        Wallet wallet = new Wallet();

        assertThat(wallet.balance())
                .isZero();
    }

    @Test
    public void newWalletAdd7ThenBalanceIs7() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(7);

        assertThat(wallet.balance())
                .isEqualTo(7);
    }

    @Test
    public void newWalletAdd10And5ThenBalanceIs15() throws Exception {
        Wallet wallet = new Wallet();

        wallet.addMoney(10);
        wallet.addMoney(5);

        assertThat(wallet.balance())
                .isEqualTo(10 + 5);
    }

}