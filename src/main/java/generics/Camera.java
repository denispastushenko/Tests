package generics;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Camera extends Product {
    private String model = "Model";

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
