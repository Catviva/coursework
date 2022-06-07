public class Main {

    private static Employee[] list = new Employee[10];

    public static void main(String[] args) {

        list[0] = new Employee("Шаркеевич Дмитрий Викторович", 1, 250_000);
        list[1] = new Employee("Шарапова Екатерина Владимировна", 2, 220_000);
        list[2] = new Employee("Новичкова Ирина Валерьевна", 3, 180_000);
        list[3] = new Employee("Кандрашин Георгий Алексеевич", 3, 230_000);
        list[4] = new Employee("Олейникова Диана Владимировна", 1, 200_000);
        list[5] = new Employee("Ремпель Иван Сергеевич", 1, 180_000);
        list[6] = new Employee("Гужвин Александр Александрович", 4, 120_000);
        list[7] = new Employee("Искандеров Артем Рамилевич", 5, 190_000);
        list[8] = new Employee("Самойлов Даниил Алексеевич", 2, 130_000);
        list[9] = new Employee("Морозова Наталья Сергеевна", 4, 205_000);

        printAllEmploeeys();


        double totalSalary = totalSalary();
        System.out.println("Зарплата всех сотрудников составляет в месяц: " + totalSalary);


        Employee minSalary = findMinSalary();
        System.out.println("Минимальная зарплата сотрудника: " + minSalary);

        Employee maxSalary = findMaxSalary();
        System.out.println("Максимальная зарплата сотрудника: " + maxSalary);

        double averageSalary = totalSalary();
        System.out.println("Средняя зарплата за месяц составила " + averageSalary + " рублей");

        printEmploeeysName();

    }

    private static double averageSalary () {
         return totalSalary() / list.length;

    }
    private static void printAllEmploeeys() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            
        }
    }

    private static double totalSalary() {
        double sum = 0;
        for (Employee employee : list) {
            sum += employee.getSalary();
        }
        return sum;
    }


    private static Employee findMinSalary() {
        double minSalary = list[0].getSalary();
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getSalary() <= minSalary) {
                minSalary = list[i].getSalary();
                index = i;}
        }
        if (index != -1) {
            return list[index];
        } else {
            return null;
        }
    }
        private static Employee findMaxSalary() {
            double maxSalary = list[0].getSalary();
            int index = -1;
            for (int i = 0; i < list.length; i++) {
                if (list[i].getSalary() >= maxSalary) {
                    maxSalary = list[i].getSalary();
                    index = i;}
            }
            if (index != -1) {
                return list[index];
            } else {
                return null;
            }
    }

            private static void printEmploeeysName() {
                for (Employee employee : list) {
                    System.out.println(employee.getName());
                    
                }
            }


}
