public class Demo {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        String a = "Mikolaj";
        String b = "Iness";
        stringBox.addItem(a);
        stringBox.addItem(b);
        System.out.println(stringBox.getItems());

        Box <Integer> intBox = new Box<>();
        Integer c = 3;
        Integer d = 11;
        intBox.addItem(c);
        intBox.addItem(d);
        System.out.println(intBox.getItems());

        Box <Toy> toyBox = new Box<>();
        Box <Food> foodBox = new Box<>();
        Box <Book> bookBox = new Box<>();

        Toy toy0 = new Toy("toy 1");
        Toy toy1 = new Toy("toy 2");
        Food food0 = new Food("food 1");
        Food food1 = new Food("food 2");
        Book book0 = new Book("book 1");
        Book book1 = new Book("book 2");
        Fantasy fant0 =new Fantasy("fant 0");

        toyBox.addItem(toy0);
        toyBox.addItem(toy1);

        foodBox.addItem(food0);
        foodBox.addItem(food1);

        bookBox.addItem(book0);
        bookBox.addItem(book1);
        bookBox.addItem(fant0);

        System.out.println(toyBox.getItems());
        System.out.println(foodBox.getItems());
        System.out.println(bookBox.getItems());

        FantasyBox <Fantasy> fantasyBox = new FantasyBox<>();
        Fantasy fantasy0 = new Fantasy("fantasy 1");
        Fantasy fantasy1 = new Fantasy("fantasy 2");
        fantasyBox.addItem(fantasy0);
        fantasyBox.addItem(fantasy1);
        // fantasyBox.addItem(book1); compilation error when trying to add Book, not Fantasy
        System.out.println(fantasyBox.getItems());

        FoodShelf<Box<Food>> foodShelf = new FoodShelf<>();
        foodShelf.addBox(foodBox);
        //foodShelf.addBox(bookBox); //compilation error when adding other boxes then those with food
        ToysShelf<Box<Toy>> toyShelf = new ToysShelf<>();
        toyShelf.addBox(toyBox);

        BookShelf<Box<Book>> bookShelf = new BookShelf<>();
        bookShelf.addBox(fantasyBox);
        bookShelf.addBox(bookBox);
        //bookShelf.addBox(toyBox); // obviously error

        UniversalShelf<Box<?>> universalShelf = new UniversalShelf<>();
        universalShelf.addBox(bookBox);
        universalShelf.addBox(fantasyBox);
        universalShelf.addBox(toyBox);
        universalShelf.addBox(foodBox);


    }
}
