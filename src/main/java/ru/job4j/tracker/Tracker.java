package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rst = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                rst[count++] = items[i];
            }
        }
        return Arrays.copyOf(rst, count);
    }

    public Item[] findByName(String key) {
        Item[] rst = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName() != null && key.equals(items[i].getName())) {
                rst[count++] = items[i];
            }
        }
        return Arrays.copyOf(rst, count);
    }

    private int indexOf(int id) {
        int rst = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rst = index != -1;
        if (rst) {
            item.setId(id);
            items[index] = item;
        }
        return rst;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - 1 - index);
            items[size - 1] = null;
            size--;
        }
    }
}