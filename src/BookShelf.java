import java.util.ArrayList;
import java.util.List;

public class BookShelf <T extends Box<Book>>
{
    List<T> collection = new ArrayList<>();

    public void addBox ( T item)
    {
        collection.add(item);
    }

    public List<T> getBoxes()
    {
        return collection;
    }
}
