public class EmployeePayroll {
    // Salary using employee ID.
    double salary(String employeeID) {
        if (employeeID.equals("E101")) {
            return 30000;
        }
        if (employeeID.equals("E102")) {
            return 40000;
        }
        return 0;
    }

    // Hours worked and hourly rate.
    double salary(int hours, double rate) {
        return hours * rate;
    }

    // Employee ID with bonus.
    double salary(String employeeID, double bonus) {
        return salary(employeeID) + bonus;
    }

    // Monthly salary from annual salary.
    double salary(double annualSalary) {
        return annualSalary / 12;
    }

    // Basic salary with overtime.
    double salary(double basic, int overtimeHours, double overtimeRate) {
        return basic + overtimeHours * overtimeRate;
    }

    // Basic salary with deductions.
    double salary(double basic, double deductions) {
        return basic - deductions;
    }

    // Basic salary with bonus and deductions.
    double salary(double basic, double bonus, double deductions) {
        return basic + bonus - deductions;
    }

    public static void main(String[] args) {
        EmployeePayroll p = new EmployeePayroll();

        System.out.println("Employee ID: " + p.salary("E101"));
        System.out.println("Hours and rate: " + p.salary(160, 200.0));
        System.out.println("ID with bonus: " + p.salary("E101", 5000.0));
        System.out.println("Annual to monthly: " + p.salary(360000.0));
        System.out.println("With overtime: " + p.salary(30000.0, 10, 200.0));
        System.out.println("With deductions: " + p.salary(30000.0, 2000.0));
        System.out.println("Bonus and deductions: " + p.salary(30000.0, 5000.0, 2000.0));
    }
}
