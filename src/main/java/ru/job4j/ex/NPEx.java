package ru.job4j.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Ruslan Popov";
        for (int i = 0; i < shops.length; i++) {
            String element = shops[i];
            if (element != null) {
                System.out.println(element + " has a size: " + element.length());
            }
        }
    }
}
