package racingcar.model;

public class Position {
    private int position = 0;

    public void plusOneStep() {
        this.position += 1;
    }

    public int getPosition() {
        return position;
    }
}
