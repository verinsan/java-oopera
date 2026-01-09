package shows;

import entities.Actor;
import entities.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();;
    }

    public void printListActors() {
        System.out.println("Актёры в спектакле '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже есть в спектакле!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameOldActor) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameOldActor)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией '" + surnameOldActor + "' не найден!");
        }
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

}
