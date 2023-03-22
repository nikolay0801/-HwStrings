import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Строки Задача 1");
        String FirstName =" Иван";
        String middleName =" Иванович";
        String lastName =" Иванов";
        String fullName =" ФИО";
        // тут idea уже сочла, что строка не нужна, так как мы уже применили конкатинацию.
        fullName = lastName + FirstName + middleName;
        System.out.println(fullName);
    }
    public static void task2() {
        System.out.println("Строки Задача 2");
        String fullName = "иванов иван иванович";
        System.out.println(fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println(" Строки Задача 3");
     String fullName = "Иванов Семён Семёнович";
     fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}

