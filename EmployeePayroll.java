public class EmployeePayroll {
    double salary(String employeeID) {
        if (employeeID.equals("E101")) {
            return 30000;
        }
        if (employeeID.equals("E102")) {
            return 40000;
        }
        return 0;
    }

    double salary(int hours, double rate) {
        return hours * rate;
    }

    double salary(String employeeID, double bonus) {
        return salary(employeeID) + bonus;
    }


    double salary(double annualSalary) {
        return annualSalary / 12;
    }

    double salary(double basic, int overtimeHours, double overtimeRate) {
        return basic + overtimeHours * overtimeRate;
    }


    double salary(double basic, double deductions) {
        return basic - deductions;
    }


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
