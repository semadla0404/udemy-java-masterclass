public class Point {
    // Fields - instance variables
    private int x;
    private int y;

    //Constructors
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods - instance methods
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((this.x - 0) * (this.x - 0)) + ((this.y - 0) * (this.y - 0)));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    public double distance(Point aPoint) {
        return Math.sqrt(((this.x - aPoint.x) * (this.x - aPoint.x)) + ((this.y - aPoint.y) * (this.y - aPoint.y)));
    }
}
