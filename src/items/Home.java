package items;

public class Home {
    private final String owner;

    public Home(String owner) {
        this.owner = owner;
        System.out.println("Дом, который принадлежит " + this.owner + ", создан");
    }

    @Override
    public String toString() {
        return "дом, который принадлежит " + this.owner;
    }
}
