package TekwillCourses.HomeWork09October.MovablePointNew;

public class MovableCenter implements Movable {
    int radius;
    MovablePoint center;

    public MovableCenter(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCenter{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }
}
