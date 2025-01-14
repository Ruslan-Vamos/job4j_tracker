package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ShopTest {

    @Test
    void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int expected = 3;
        int rst = Shop.indexOfNull(products);
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Bread", 4);
        int expected = 0;
        int rst = Shop.indexOfNull(products);
        assertThat(rst).isEqualTo(expected);
    }

    @Test
    void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Bread", 4);
        int expected = -1;
        int rst = Shop.indexOfNull(products);
        assertThat(rst).isEqualTo(expected);
    }
}