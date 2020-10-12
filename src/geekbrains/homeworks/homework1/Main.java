package geekbrains.homeworks.homework1;


import com.sun.codemodel.internal.JForEach;

public class Main {

    public static void main(String[] args){
        Employee employee1 = new Employee("James Petrov",
                                        "Web Developer",
                                          "james@gmail.com",
                                    "90832342", 90000, 30);
        employee1.getEmployeeInfo();


        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan",
                                        "Engineer",
                                        "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Sergey Sergeev",
                                       "Manager",
                                         "serg@mailbox.com", "892312312", 70000, 50);
        employeesArray[2] = new Employee("Mike Kovalsky",
                                        "Front End Developer",
                                          "kovalsky@mailbox.com", "892312312", 30000, 20);
        employeesArray[3] = new Employee("Ivanova Maria",
                                        "Lead Engineer",
                                          "ivivan@mailbox.com", "892312312", 30000, 60);
        employeesArray[4] = new Employee("Ivanova Masha",
                                        "Engineer",
                                           "ivivamasha@mailbox.com", "892312312", 20000, 31);
        for (Employee employee : employeesArray) {
            employee.printOlderThen40();
        }
    }

}

