import java.util.ArrayList;
import java.util.List;

public class FoodShelf <T extends Box<Food>>
{
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
