package generics;


import com.google.common.base.MoreObjects;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Product implements Comparable<Product> {

    private String nameOfTheProduct = "Name11";
    private double price = 9.0;

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

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
    public int compareTo(Product product) {
        if (this.getNameOfTheProduct().equals(product.getNameOfTheProduct())){
            return 0;
        }
        else return -1;
    }
}
