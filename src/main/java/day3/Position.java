package day3;

public class Position {

    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveX(int dx) {
        x += dx;
    }
    public void moveY(int dy) {
        y += dy;
    }
}
