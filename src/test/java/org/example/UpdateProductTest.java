package org.example;

import org.example.exo5.Product;
import org.example.exo5.Store;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UpdateProductTest {

    private Product product;
    private Store store;
    @BeforeEach
    void setup(){
        store = new Store();
    }

    private void initUpdateProduct(int quality, int selling) {
        product = new Product();
        product.setQuality(quality);
        product.setSelling(selling);
    }
        @Test
        public void testNormalProductQualityDecrement() {
            initUpdateProduct(10, 20);
            product.update();
            Assertions.assertEquals(9, product.getSelling());
            Assertions.assertEquals(19, product.getQuality());
        }

        @Test
        public void testQualityNeverNegative() {
            initUpdateProduct(5, 0);
            product.update();
            Assertions.assertEquals(4, product.getSelling());
            Assertions.assertEquals(0, product.getQuality());
        }

        @Test
        public void testQualityNeverAbove50() {
            initUpdateProduct(5, 60);
            product.update();
            Assertions.assertEquals(4, product.getSelling());
            Assertions.assertEquals(50, product.getQuality());
        }

        @Test
        public void testExpiredProductQualityDecrement() {
            initUpdateProduct(0, 10);
            product.update();
            Assertions.assertEquals(-1, product.getSelling());
            Assertions.assertEquals(8, product.getQuality());
        }

    }
    
