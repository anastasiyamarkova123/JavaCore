package lesson1;
import lesson1.Competitor;
import lesson1.Team;

import lesson1.Animal;
import lesson1.Competitor;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}
