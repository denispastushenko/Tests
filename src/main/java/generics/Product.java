package generics;


import com.google.common.base.MoreObjects;

import java.util.Comparator;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Product implements Comparable<Product>, Common{

    private String nameOfTheProduct = "Name11";
    private double price = 9.0;


    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", nameOfTheProduct)
                .add("price", price)
                .toString();
    }

    @Override
    public int compareTo(Product product) {//todo ask V
       return Comparator.comparing(Product::getName)
                .compare(this, product);
    }

    @Override
    public String getName() {
        return nameOfTheProduct;
    }
}
