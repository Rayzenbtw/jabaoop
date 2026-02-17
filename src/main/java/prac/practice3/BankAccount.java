package prac.practice3;

public class BankAccount {

    private double balance;                 // баланс конкретного рахунку
    private static double interestRate = 0.05; // процентна ставка
    private static double totalBalance = 0.0;  // суммарный баланс всех счетов
    private static double bankReserve = 0.0;

    public BankAccount(double initial) {
        this.balance = initial;
        totalBalance += balance;
    }

    public BankAccount() {
        this(0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalBalance += amount;
        }
    }

    public boolean withdraw(double amount) {
        double commission = amount * 0.01; // 1% комиссия
        double totalAmount = amount + commission;

        if (amount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            totalBalance -= amount;
            bankReserve += commission;   // зароботок банка

            System.out.printf("Снятие %.2f ,комиссия %.2f. Новый баланс: %.2f.",
                    amount, commission, balance);

            return true;
        } else {
            System.out.println("Недостаточно средств для снятия с учётом комиссии.");
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        double interest = balance * interestRate;

        System.out.printf(" %.2f денег на счет с балансом %.2f%n", interest, balance);

        if (interest <= bankReserve) { // банк платит проценты из резерва
            balance += interest;
            bankReserve -= interest;
            System.out.printf(" %.2f начислено. Новый баланс: %.2f%n", interest, balance);
        } else {
            System.out.printf("Банк без денег, процентов не будет", interest);
        }
    }


    public static void setInterestRate(double rate) {
        if (rate >= 0 && rate <= 1) {
            interestRate = rate;
        }
    }

    public static double getInterestRate() {
        return interestRate;
    }

    // --- Общий баланс всех счетов ---
    public static double getTotalBalance() {
        return totalBalance;
    }

    // --- Резерв банка ---
    public static double getBankReserve() {
        return bankReserve;
    }

    public static void addToReserve(double amount) {
        if (amount > 0) {
            bankReserve += amount;
        }
    }
}
