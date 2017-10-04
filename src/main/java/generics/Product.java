package generics;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Product implements Comparable<Product> {

    private String name = "Name";
    private double price = 9.0;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

}
