package ZapisOdczyt;

public class Employee extends Person {
    double payment;

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    Employee(String name, String sureName, double payment) {
        super(name, sureName);
        this.payment = payment;
    }
}
