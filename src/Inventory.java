import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Inventory<T> {
    private Map<T, Integer> inventory;

    public Inventory() {
        inventory = new LinkedHashMap<>();
    }

    public int getQuantity(T item) {
        Integer value = inventory.get(item);
        return value == null ? 0 : value; // returneaza 0 daca value == null sau value daca value != null
    }

    public void add(T item) {
        int count = inventory.get(item);
        inventory.put(item, count + 1);
    }

    public boolean hasItem(T item) {

        if (getQuantity(item) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void decrease(T item) {
        if (hasItem(item)) {
            int count = inventory.get(item);
            inventory.put(item, count - 1);
        }
    }

    public void clear() {
        inventory.clear();
    }

    public void put(T item, int quantity) {
        inventory.put(item, quantity);
    }

    @Override
    public String toString() {
        return inventory + " ";
    }
}