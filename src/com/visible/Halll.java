package com.visible;

class PaymentApp {
    void pay() {
        System.out.println("Pay to buy!");
    }
}

class Upi extends PaymentApp {
	@Override
    void pay() {
        System.out.println("Pay using UPI app!");
    }
}

class Wallet extends PaymentApp {
    void pay() {
        System.out.println("Pay using online wallet!");
    }
}

class Card extends PaymentApp {
    void pay() {
        System.out.println("Pay using card!");
    }
}

public class Halll {
    public static void main(String[] args) {
        PaymentApp upi = new Upi();
        upi.pay();

        PaymentApp wal = new Wallet();
        wal.pay();

        PaymentApp card = new Card();
        card.pay();
    }
}