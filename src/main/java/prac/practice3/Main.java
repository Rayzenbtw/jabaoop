package prac.practice3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Створення рахунків");
        BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(500);

        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());

        System.out.println("\n Поповнення і зняття");
        acc1.deposit(200);
        acc2.withdraw(100);

        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());

        System.out.println("\nНарахування відсотків");
        acc1.applyInterest();
        acc2.applyInterest();

        System.out.println("Баланс acc1: " + acc1.getBalance());
        System.out.println("Баланс acc2: " + acc2.getBalance());
        System.out.println("Загальний баланс: " + BankAccount.getTotalBalance());

        System.out.println("\nЗміна процентної ставки");
        BankAccount.setInterestRate(0.1);

        System.out.println("Нова ставка: " + BankAccount.getInterestRate());
    }
}
