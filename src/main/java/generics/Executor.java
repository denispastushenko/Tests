package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Executor {

    private abstract class Example extends Product {
        private String ex = "DDDD";

        public String getEx() {
            return ex;
        }
    }

    public static void main(String[] args) {

        Container<Product> example = new Container<>();
        Container<Product> cameraContainer = new Container<>();
        Container<Product> phoneContainer = new Container<>();
        //Container<String> stringContainer = new Container<String>(); //OK


        example.setItem(new Product());
        cameraContainer.setItem(new Camera("WorkCamera", "RX7"));
        phoneContainer.setItem(new Phone(121, "Phone111"));
        System.out.println(example.getItem().getName());
        System.out.println(phoneContainer.getItem().getPrice());
        System.out.println(cameraContainer.getItem().getName());
        System.out.println(phoneContainer.getItem());

        Container container = new Container<>();

        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera("MovieCamera", "RX7"));

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(122, "Phone122"));

        List<Object> objectList = new ArrayList<>();
        objectList.add(9);
        objectList.add(phones.stream().findFirst().get().getPixel());
        objectList.add(cameras);
        objectList.add("Str");

        List<String> strings = new ArrayList<>();
        strings.add("Yo Yo YO");

        List<Example> examples = new ArrayList<>();


        container.tryPrint1(objectList);//todo ask V why
        container.tryPrint3(objectList);//todo ask V why
        //container.tryPrint1(container.tryPrint(cameras).getPrice());//todo ask V why
        container.tryPrint(cameras);

        copy(phones, objectList);
        // copy(phones,strings);//todo ask V why
        //copy(phones, examples);//todo ask V why

        System.out.println("Product Names are equals: " + example.getItem().compareTo(new Phone(121, "Phone111")));// if equals (0 - 0)
        System.out.println("Product Names are not equals: " + example.getItem().compareTo(new Camera("WorkCamera1", "RX71"))); // if not equals (-1 - -1)



        Camera camera = new Camera("WorkCamera22", "RX722");
        Camera camera1 = new Camera("WorkCamera22", "RX722");
        Phone phone = new Phone(12, "Phone11");
        Phone phone1 = new Phone(12, "Phone1");
        System.out.println("Products are not equals: " + phone.compareTo(phone1));
        System.out.println("Products are equals: " + camera.compareTo(camera1));
        //System.out.println("Products are not equals: " + camera.compareTo(phone));//todo ask V why

    }

    private static void copy(List<? extends Product> list1, List<? super Product> list) {
        list.addAll(list1);
        System.out.println(list);
    }
}
