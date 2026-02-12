package homework.Task9;

public class TaxDemo {
    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.calculateIncomeTax(100000);
        tax.calculateIncomeTax(400000);
        tax.calculateIncomeTax(800000);
        tax.calculateIncomeTax(0);
        tax.printSalaryAndTax(100000);
        tax.printSalaryAndTax(200000);


    }
}

