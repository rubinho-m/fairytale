package items;

import characters.Animal;

public class Day {
    private final String typeOfDay;
    private final Animal mainCharacter;

    public Day(String typeOfDay, Animal mainCharacter) {
        this.typeOfDay = typeOfDay;
        this.mainCharacter = mainCharacter;
        System.out.println(typeOfDay + " день начался");
    }

    public void showPlans(){
        System.out.println(typeOfDay + " день:");
        mainCharacter.showListToDo();
    }
}
