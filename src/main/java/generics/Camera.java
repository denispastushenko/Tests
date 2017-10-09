package generics;

import com.google.common.base.MoreObjects;


/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Camera extends Product<Camera> {
    private String nameOfTheCamera;
    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public String getName() {
        return nameOfTheCamera;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("nameOfTheCamera", nameOfTheCamera)
                .add("model", model)
                .toString();
    }

    public Camera(String nameOfTheCamera, String model) {
        this.nameOfTheCamera = nameOfTheCamera;
        this.model = model;
    }
}
