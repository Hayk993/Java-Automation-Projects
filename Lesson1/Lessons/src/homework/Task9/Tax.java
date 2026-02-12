package homework.Task9;

public class Tax {
    int salary;
    double tax;


    void calculateIncomeTax(int salary) {
        if (salary < 150_000) {
            System.out.println(calculateTax(salary));
        } else if (salary <= 500_000) {
            System.out.println(calculateTax(150000) + calculateTax(salary, 2));
        } else {
            System.out.println(calculateTax(150000) + calculateTax(salary, 2) + calculateTax(salary, 3));
        }
    }

    double calculateTax(int i) {
        return (double) i * 0.15;
    }

    double calculateTax(int amount, int typ) {
        if (typ == 2) {
            return (double) (amount - 150000) * 0.2;
        }
        if (typ == 3) {
            return (double) ((amount - 500000) / 1000 * 300);
        }
        return 0;
    }
    void printSalaryAndTax(int salary){
        System.out.println("the salary is " + salary);
        if (salary < 150_000) {
            System.out.println("the tax of salary is " + calculateTax(salary));
        } else if (salary <= 500_000) {
            System.out.println("the tax of salary is " + calculateTax(150000) + calculateTax(salary, 2));
        } else {
            System.out.println("the tax of salary is " + calculateTax(150000) + calculateTax(salary, 2) + calculateTax(salary, 3));
        }

    }

}
