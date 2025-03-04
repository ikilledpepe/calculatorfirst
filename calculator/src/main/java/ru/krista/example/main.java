package ru.krista.example;

public static void main(String[] args) {
    calculator calc = new calculator();
    Scanner scanner = new Scanner(System.in);
    calc.readValues();
    System.out.println("Выберите операцию (+, -, *, /):");
    String operation = scanner.nextLine();
    calc.readSecondValue();
    calc.printResult(operation);
    }
