package characters;

import abilities.AbleToBeCaring;
import abilities.Livable;
import enums.DayTime;
import items.Home;

public class Kangaroo extends Animal implements AbleToBeCaring, Livable {


    private Kangaroo child;
    private Guest guest;

    public Kangaroo(String name) {
        super(name);
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Kangaroo getChild() {
        return child;
    }

    public void setChild(Kangaroo child) {
        this.child = child;
    }


    @Override
    public void eat(DayTime eatingTime) {
        String nameOfEating = eatingTime.getTranslation();
        System.out.println(this.getName() + " ест на " + nameOfEating + " " + this.getFoodToEat());
    }

    @Override
    public void showListToDo() {
        System.out.println("Заботиться о " + this.getChild());
        System.out.println("Заботиться о " + this.getGuest());
    }

    @Override
    public boolean isConcerned(Animal subjectToConcernAbout) {
        if (subjectToConcernAbout.equals(child)) {
            System.out.println(this.getName() + " заботится о своем чаде - " + subjectToConcernAbout.getName());
        } else {
            System.out.println(this.getName() + " не будет заботиться о неизвестном ему животном");
        }

        return subjectToConcernAbout.equals(child);
    }

    @Override
    public boolean isConcerned(Guest subjectToConcernAbout) {
        if (subjectToConcernAbout.isHungry()) {
            System.out.println(this.getName() + " считает, что ему нужно подкрепиться");
        } else {
            System.out.println(this.getName() + " не считает, что ему нужно подкрепиться");
        }
        return subjectToConcernAbout.isHungry();
    }


    @Override
    public void concern(Guest concernedSubject) {
        System.out.println(concernedSubject.getPronoun() + " получает " + concernedSubject.getFood());

    }

    @Override
    public void settle(Home home) {
        System.out.println(this.getName() + " живет в " + home);
    }
}
