package generics;

import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * Created by denys.pastushenko on 04/10/2017.
 */
public class Container <T extends Product> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    void tryPrint1(List<? extends Product> list1){
        System.out.println(list1);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("item", item)
                .toString();
    }
}
