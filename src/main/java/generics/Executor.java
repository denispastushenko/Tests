package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Executor {

    public static void main(String[] args) {

        Container<Product> example = new Container<>();
        Container<Product> cameraContainer = new Container<>();
        Container<Product> phoneContainer = new Container<>();
        //Container<String> stringContainer = new Container<String>(); //OK


        example.setItem(new Product());
        cameraContainer.setItem(new Camera());
        phoneContainer.setItem(new Phone());
        System.out.println(example.getItem().getName());
        System.out.println(phoneContainer.getItem().getPrice());
        System.out.println(cameraContainer.getItem().getName());
        System.out.println(phoneContainer.getItem());

        Container container = new Container<>();
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera());
        List<Object> objectList = new ArrayList<>();
        objectList.add(9);
        objectList.add(cameras);
        objectList.add("Str");
        container.tryPrint1(objectList);//todo ask V why
        container.tryPrint3(objectList);//todo ask V why
        //container.tryPrint1(container.tryPrint(cameras).getPrice());//todo ask V why
        container.tryPrint(cameras);

    }
}
