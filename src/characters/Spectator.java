package characters;

public class Spectator extends Person{

    public Spectator(String pronoun) {
        super(pronoun);
        System.out.println("Наблюдатель создан");
    }

    @Override
    public void showInfo() {
        System.out.println("Наблюдатель.");
    }

}
