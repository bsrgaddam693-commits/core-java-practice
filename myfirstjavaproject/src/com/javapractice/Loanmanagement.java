package com.javapractice;

public class Loanmanagement {




    String customerName;
    double loanAmount;
    double interestRate;
    int loanTenure;

    // Method 1: Calculate Simple Interest
    double calculateInterest(double loanAmount, double interestRate) {
        return (loanAmount * interestRate * loanTenure) / 100;
    }

    // Method 2: Calculate Total Amount
    double calculateTotalAmount(double interest) {
        return loanAmount + interest;
    }

    // Method 3: Calculate Monthly EMI
    double calculateMonthlyEMI(double totalAmount, int loanTenure) {
        return totalAmount / (loanTenure * 12);
    }

    // Method 4: Display Loan Summary
    void displayLoanSummary(double interest, double totalAmount, double emi) {
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Loan Amount     : Rs. " + loanAmount);
        System.out.println("Interest Rate   : " + interestRate + "%");
        System.out.println("Loan Tenure     : " + loanTenure + " years");
        System.out.println("Simple Interest : Rs. " + interest);
        System.out.println("Total Amount    : Rs. " + totalAmount);
        System.out.println("Monthly EMI     : Rs. " + emi);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        // First Object
        Loanmanagement l1 = new Loanmanagement();

        l1.customerName = "Ravi";
        l1.loanAmount = 200000;
        l1.interestRate = 8;
        l1.loanTenure = 5;

        double interest1 = l1.calculateInterest(
                l1.loanAmount, l1.interestRate);

        double total1 = l1.calculateTotalAmount(interest1);

        double emi1 = l1.calculateMonthlyEMI(
                total1, l1.loanTenure);

        System.out.println("===== LOAN SUMMARY 1 =====");
        l1.displayLoanSummary(interest1, total1, emi1);

        // Second Object
        Loanmanagement l2 = new Loanmanagement();

        l2.customerName = "Suresh";
        l2.loanAmount = 500000;
        l2.interestRate = 10;
        l2.loanTenure = 4;

        double interest2 = l2.calculateInterest(
                l2.loanAmount, l2.interestRate);

        double total2 = l2.calculateTotalAmount(interest2);

        double emi2 = l2.calculateMonthlyEMI(
                total2, l2.loanTenure);

        System.out.println("===== LOAN SUMMARY 2 =====");
        l2.displayLoanSummary(interest2, total2, emi2);
    }



	}

