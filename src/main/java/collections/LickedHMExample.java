package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Denys_Pastushenko on 10/27/2017.
 */
public class LickedHMExample<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LickedHMExample(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
