package prac.practice3;

public class Main {
    public static void main(String[] args) {

        BankAccount.addToReserve(60); // маленький резерв, чтобы не хватило на второй счет

        System.out.println("Створення рахунків");
        BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(500);

        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());
        System.out.println("Резерв банка: " + BankAccount.getBankReserve());

        System.out.println("\nПоповнення і зняття");
        acc1.deposit(200);
        acc2.withdraw(100); // с комиссией 1%

        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());
        System.out.println("Резерв банка: " + BankAccount.getBankReserve());

        System.out.println("\nНарахування відсотків");

        System.out.println("Начисляем проценты на acc1:");
        acc1.applyInterest(); // должно начислить нормально

        System.out.println("Начисляем проценты на acc2:");
        acc2.applyInterest(); // должно показать предупреждение

        System.out.println("\nБаланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());
        System.out.println("Резерв банка: " + BankAccount.getBankReserve());

        System.out.println("\nЗміна процентної ставки");
        BankAccount.setInterestRate(0.1);

        System.out.println("Нова ставка: " + BankAccount.getInterestRate());
    }
}
