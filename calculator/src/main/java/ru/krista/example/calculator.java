package ru.krista.example;

import java.util.Scanner;

public class calculator {
    private double value1;
    private double value2;
    
    public void readValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        value1 = scanner.nextDouble();
    }
    public void printResult(String operation) {
        double result;
        switch(operation) {
            case "+":
                result = add();
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = subtract();
                System.out.println("Результат: " + result);
                break;
            case "/":
                result = divide();
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = multiply();
                System.out.println("Результат: " + result);
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                break;
        }
    }
    public void readSecondValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите второе значение: ");
        value2 = scanner.nextDouble();
    }
    public double add() {
        return value1 + value2;
    }
    public double subtract() {
        return value1 - value2;
    }
    public double multiply() {
        return value1 * value2;
    }
    public double divide() {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            System.out.println("Ошибка: деление на ноль");
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner scanner = new Scanner(System.in);
        calc.readValues();
        System.out.println("Выберите операцию (+, -, *, /):");
        String operation = scanner.nextLine();
        calc.readSecondValue();
        calc.printResult(operation);
    }
}
