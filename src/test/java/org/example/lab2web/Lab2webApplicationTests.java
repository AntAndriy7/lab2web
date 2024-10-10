package org.example.lab2web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab2webApplicationTests {

    @Test
    public void testProductConstructor() {
        Product product = new Product(1, "Test Product");
        assertEquals(1, product.getId());
        assertEquals("Test Product", product.getName());
    }

}