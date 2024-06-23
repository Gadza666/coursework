public class Main {
    private static Employee[] employees = new Employee[10];

    static void inicial() {
        employees[0] = new Employee("Гаврилин Тема Алексееч", 10_000, 1);
        employees[1] = new Employee("Богданов Богдан Богданович", 20_000, 2);
        employees[2] = new Employee("Тереньтев Миромир Никитичь", 30_000, 1);
        employees[3] = new Employee("Пушкин Александер Сергеевич", 25_000, 4);
        employees[4] = new Employee("Колотов Максим Евгенивич", 40_000, 1);
        employees[5] = new Employee("Вялкин Владимир Миромирович", 50_000, 5);
        employees[6] = new Employee("Жигулев Богдан Рашидович", 40_000, 4);
        employees[7] = new Employee("Симонов Евгений Олегович", 30_000, 3);
        employees[8] = new Employee("Понаморев Владик Вячеславович", 45_000, 2);
        employees[9] = new Employee("Токарев Кирилл Джабраилович", 35_000, 4);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        inicial();
        printEmployee();
        minSalaryEmployee();
        personMinSalaryEmployee();
        System.out.println("Минимальная зарплата у сотрудника " + personMinSalaryEmployee() + " и составляет " + minSalaryEmployee());
        maxSalaryEmployee();
        personMaxSalaryEmployee();
        System.out.println("Максимальная  зарплата у сотрудника " + personMaxSalaryEmployee() + " и составляет " + maxSalaryEmployee());
        System.out.println("сумму затрат на ЗП в месяц=" + getSalarySum());
        System.out.println("среднее значение зарплат=" + avarageSalaryEmployee());
        printEmploeesFullName();
    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int minSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() < minSalaryEmployee) {
                minSalaryEmployee = employees[i].getSalaryOfEmployee();
            }
        }
        return minSalaryEmployee;
    }

    private static String personMinSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMinSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() < minSalaryEmployee) {
                personMinSalary = employees[i].getFullNameOfEmployee();
            }
        }
        return personMinSalary;
    }

    private static int maxSalaryEmployee() {
        int maxSalaryEmployee = employees[0].getSalaryOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryOfEmployee();
            }
        }
        return maxSalaryEmployee;
    }

    private static String personMaxSalaryEmployee() {
        int maxSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMaxSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryOfEmployee();
                personMaxSalary = employees[i].getFullNameOfEmployee();
            }
        }
        return personMaxSalary;
    }

    private static void printEmploeesFullName() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника=>" + employee.getFullNameOfEmployee());
        }
    }
    private static double avarageSalaryEmployee() {
        return (double) (getSalarySum()/employees.length);
    }
    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryOfEmployee();
        }
        return sum;
    }
}
