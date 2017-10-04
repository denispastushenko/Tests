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
       //Container<String> stringContainer = new Container<String>();


       // example.setItem(new Product());
        //System.out.println(example.getItem().getName());
       // System.out.println(example.getItem().getPrice());
        //System.out.println(cameraContainer.getItem().getPrice());

        //System.out.println(phoneContainer.getItem().getPixel());

        Container container = new Container<>();
        List<Container<Product>> containerList = new ArrayList<>();
        containerList.add(example);
        containerList.add(cameraContainer);
        containerList.add(phoneContainer);
        List<Object> objectList = new ArrayList<>();
        objectList.add(9);
        container.tryPrint1(objectList);
        container.tryPrint1(containerList);

    }
}
