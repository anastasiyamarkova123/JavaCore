package lesson1;


import lesson1.*;
import lesson1.*;

public class MainClass {
    public static void main(String[] args) {

        Competitor[] competitors = {new Human("Джек"), new Cat("Том"), new Dog("Плуто")};
        Obstacle[] obstacles = {new Cross(800), new Wall(5), new Water(3)};

        Team team = new Team("Друзья", competitors);

        System.out.println("Новая команда ");
        System.out.println(team.getTeamName());

        System.out.println("Приветствуем участников команды");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Участники проходят марафон");
        course.doIt(team);

        System.out.println("Результаты команды");
        team.showResults();

        System.out.println("Участники завершили марафон");
        team.showMembersFinishedCourse();
    }
}