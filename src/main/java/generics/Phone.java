package generics;

import com.google.common.base.MoreObjects;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Phone extends Product<Phone> {

    private int pixel = 16;
    private String nameOfThePhone = "Name11";

    public int getPixel() {
        return pixel;
    }

    public Phone(int pixel, String nameOfThePhone) {
        this.pixel = pixel;
        this.nameOfThePhone = nameOfThePhone;
    }

    @Override
    public String getName() {
        return nameOfThePhone;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pixel", pixel)
                .add("nameOfThePhone", nameOfThePhone)
                .toString();
    }
}
