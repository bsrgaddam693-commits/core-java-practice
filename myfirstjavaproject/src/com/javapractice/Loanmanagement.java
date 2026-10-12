package com.javapractice;

public class Loanmanagement {


    String customerName;
    double loanAmount, interestRate;
    int loanTenure;

    double calculateInterest(double amount, double rate) {
        return amount * rate * loanTenure / 100;
    }

    double calculateTotalAmount(double interest) {
        return loanAmount + interest;
    }

    double calculateMonthlyEMI(double total, int years) {
        return total / (years * 12);
    }

    void displayLoanSummary(double interest, double total, double emi) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);
        System.out.println("Monthly EMI: " + emi);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Loanmanagement a = new Loanmanagement();
        a.customerName = "Ravi";
        a.loanAmount = 200000;
        a.interestRate = 8;
        a.loanTenure = 5;

        double i = a.calculateInterest(a.loanAmount, a.interestRate);
        double t = a.calculateTotalAmount(i);
        double e = a.calculateMonthlyEMI(t, a.loanTenure);
        a.displayLoanSummary(i, t, e);

        Loanmanagement b = new Loanmanagement();
        b.customerName = "Suresh";
        b.loanAmount = 500000;
        b.interestRate = 10;
        b.loanTenure = 4;

        i = b.calculateInterest(b.loanAmount, b.interestRate);
        t = b.calculateTotalAmount(i);
        e = b.calculateMonthlyEMI(t, b.loanTenure);
        b.displayLoanSummary(i, t, e);
    }
}


	


