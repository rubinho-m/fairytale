import characters.Guest;
import characters.Kangaroo;
import characters.Rabbit;
import characters.Spectator;
import enums.DayTime;
import enums.Priority;
import items.Day;
import items.Home;
import items.Issue;

public class Main {
    public static void main(String[] args) {
        Guest mainCharacter = new Guest("Он");
        Spectator we = new Spectator("Мы");
        Kangaroo kenga = new Kangaroo("Кенга");
        Kangaroo ru = new Kangaroo("Ру");
        String porridge = "ложка-другая кашки";
        kenga.setChild(ru);
        kenga.setGuest(mainCharacter);
        ru.setGuest(mainCharacter);
        we.setEmotion("не удивляемся");
        we.showEmotion();
        Home kengaHome = new Home(kenga.getName());
        kenga.settle(kengaHome);
        ru.settle(kengaHome);
        mainCharacter.settle(kengaHome);
        mainCharacter.setFood("рыбий жир");
        mainCharacter.eat(DayTime.BREAKFAST);
        mainCharacter.eat(DayTime.LUNCH);
        mainCharacter.eat(DayTime.DINNER);
        mainCharacter.setHungry(true);
        if (kenga.isConcerned(mainCharacter)) {
            mainCharacter.setFood(porridge);
            kenga.concern(mainCharacter);
        }
        if (kenga.isConcerned(ru)){
            ru.setFoodToEat(porridge);
            ru.eat(DayTime.BREAKFAST);
        }

        Rabbit rabbit = new Rabbit("Кролик");
        Day day = new Day("занятой", rabbit);
        rabbit.setPriority(Priority.ORGANISE);
        rabbit.setIssue(new Issue(true, false, false));
        rabbit.wakeUp();
        rabbit.feel();
        day.showPlans();





    }
}


