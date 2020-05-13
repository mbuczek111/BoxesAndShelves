import java.util.ArrayList;
import java.util.List;

public class UniversalShelf <T extends Box<?>>{
    List<T> collection = new ArrayList<>();

    public void addBox (T item)
    {
        collection.add(item);
    }

    public List<T> getBoxes()
    {
        return collection;
    }
}
