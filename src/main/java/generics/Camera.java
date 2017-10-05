package generics;

import com.google.common.base.MoreObjects;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Camera extends Product {
    private String model = "Model -- 1";

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("model", model)
                .toString();
    }
}
