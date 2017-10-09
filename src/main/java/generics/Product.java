package generics;


import com.google.common.base.MoreObjects;

import java.util.Comparator;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
class Product<T extends Product<T>> implements Comparable<T> {

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

   /* @Override
    public int compareTo(Product product) {//todo ask V Почему возвращает 2? (-1 - -1)
       return Comparator.comparing(Product::getName)
                .compare(this, product);                   // It works when product  class not static, without generic
    }*/

 /*  @Override
    public int compareTo(T product) {//todo ask V
        if(this.getName().equals(product.getName())){
            return 0;
        }
        else return -1;
}*/
  @Override
      public int compareTo(T product) {
          if(this.getName().equals(product.getName())){
              return 0;
          }
          else return -1;
      }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product<?> product = (Product<?>) o;

        return Double.compare(product.price, price) == 0 &&
                (nameOfTheProduct != null ? nameOfTheProduct
                        .equals(product.nameOfTheProduct)
                        : product.nameOfTheProduct == null);
    }


    public String getName() {
        return nameOfTheProduct;
    }

}
