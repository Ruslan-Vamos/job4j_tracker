package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer() {
    }

    public Computer(int ssd, String cpu) {
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd);
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer defaultComputer = new Computer();
        Computer initializedComputer = new Computer(true, 1024, "Intel Core I7");
        Computer third = new Computer(1024, "AMD Ryzen 5");
        Computer fourth = new Computer(true, 1024.0, "AMD Ryzen 7");
        defaultComputer.printInfo();
        initializedComputer.printInfo();
        third.printInfo();
        fourth.printInfo();
    }
}
