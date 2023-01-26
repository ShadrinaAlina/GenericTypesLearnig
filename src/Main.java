import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Object o = new Scanner(System.in); //  к переменной object  можно присвоить объект любого класса
        Scanner scanner = null; // инициализация
        if (o instanceof  Scanner) scanner = (Scanner) o; // проверяет класс при приобразовании объкта ы true/false
        if (scanner != null){ // проверка
            scanner.nextInt();
        }
        Object o1 = new String(); // вкладываем другие типы данных
        Object o2 = new Integer(15); //кладываем другие типы данных
        Object[] objects = {10, "Привет", 3.14}; // здесь происходит авто упаковка

}}