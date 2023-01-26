package genericmethods;

public class Main {
    public static void main (String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Alisa", "Bob", "Bogdan"};
        Integer[] integers = {15,25,4};
        printer.print(strings);
        printer.print(integers);
    }
    }
