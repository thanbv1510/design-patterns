package dev.thanbv1510.patterns.structural.bridge.refactor;

public class MainApp {
    public static void main(String[] args) {
        Bank vcBank = new VietComBank(new CheckingAccount());
        vcBank.openAccount();

        TPBank tpBank = new TPBank(new SavingAccount());
        tpBank.openAccount();
    }
}
