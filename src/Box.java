import java.util.ArrayList;
import java.util.List;

public class Box <T> {
List<T> collection = new ArrayList<>();

public void addItem(T item)
    {
    collection.add(item);
    }

public List<T> getItems()
    {
    return collection;
    }
}

