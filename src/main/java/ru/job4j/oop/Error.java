package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    Error() {
    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error ioob = new Error(true, 1, "Index out of bound");
        Error failedTest = new Error(true, 1, "Test failed");
        error.printError();
        ioob.printError();
        failedTest.printError();
    }
}
