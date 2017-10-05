package generics;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Container<T extends Product> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public <T extends Product> T tryPrint(List<T> list1) {
        return list1.stream().findFirst().get();//todo ask V why
    }

    void tryPrint1(List<? super Product> list) {//todo ask V why
        System.out.println(list);
    }
    void tryPrint3(List<? extends Product>list) {
        System.out.println(list);//todo ask V why
    }
}


