public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    public double distance(Point point){
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));
    }

    public double distance(int x, int y){
        double result = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return result;
    }
}
