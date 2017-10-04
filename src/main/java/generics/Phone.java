package generics;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Phone extends Product {

    private int pixel = 16;

    public int getPixel() {
        return pixel;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
