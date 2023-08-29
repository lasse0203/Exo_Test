package org.example.exo5;




public class Store {

    public void update(Product product) {
        product.setQuality(product.getQuality() - 1);
        product.setSelling(product.getSelling() - 1);
    }

}


