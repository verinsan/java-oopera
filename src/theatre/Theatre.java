package theatre;

import entities.Actor;
import entities.Director;
import enums.Gender;
import shows.Ballet;
import shows.Opera;
import shows.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor firstActor = new Actor("Михаил", "Сидоров", Gender.MALE, 184);
        Actor secondActor = new Actor("Иван", "Петров", Gender.MALE, 185.2);
        Actor thirdActor = new Actor("Мария", "Иванова", Gender.FEMALE, 197.7);

        Director firstDirector = new Director("София", "Смирнова", Gender.FEMALE, 6);
        Director secondDirector = new Director("Олег", "Соколов", Gender.MALE, 9);

        String musicAuthor = "Андрей Попов";
        String choreographer = "Виктория Боброва";

        Show regularShow = new Show("Обычный спектакль", 125, firstDirector);
        Opera opera = new Opera("Ромео и Джульетта", 163, firstDirector,
                musicAuthor, "Либретто к опере 'Ромео и Джульетта'", 10);
        Ballet ballet = new Ballet("Лебединое озеро", 171, secondDirector,
                musicAuthor, "Либретто к балету 'Лебединое озеро'", choreographer);

        regularShow.addActor(firstActor);
        regularShow.addActor(secondActor);

        opera.addActor(secondActor);
        opera.addActor(thirdActor);

        ballet.addActor(firstActor);
        ballet.addActor(thirdActor);

        ballet.addActor(firstActor);

        System.out.println("\nСписки актёров");
        regularShow.printListActors();
        opera.printListActors();
        ballet.printListActors();

        System.out.println("\nИнформация о режиссёрах");
        regularShow.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();

        System.out.println("\nЗамена актёра");
        Actor newActor = new Actor("Ольга", "Лебедева", Gender.FEMALE, 170.0);
        opera.replaceActor(newActor, "Петров");

        System.out.println("\nСписок актёров оперы");
        opera.printListActors();

        System.out.println("\nПопытка замены несуществующего актёра");
        ballet.replaceActor(newActor, "Бобров");

        System.out.println("\nЛибретто");
        opera.printLibretto();
        ballet.printLibretto();

    }
}
