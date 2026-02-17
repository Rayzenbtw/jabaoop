package prac.practice3;

public class BankAccount {

        private double balance;                 // баланс конкретного рахунку
        private static double interestRate = 0.05; // процентна ставка
        private static double totalBalance = 0.0;  // загальний баланс усіх рахунків


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
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                totalBalance -= amount;
                return true;
            }
            return false;
        }

        public double getBalance() {
            return balance;
        }

        //Нарахування відсотків
        public void applyInterest() {
            double interest = balance * interestRate;
            balance += interest;
            totalBalance += interest;
        }

        // зміна ставки в процентах
        public static void setInterestRate(double rate) {
            if (rate >= 0 && rate <= 1) {
                interestRate = rate;
            }
        }

        public static double getInterestRate() {
            return interestRate;
        }

        //Загальний баланс
        public static double getTotalBalance() {
            return totalBalance;
        }

}
