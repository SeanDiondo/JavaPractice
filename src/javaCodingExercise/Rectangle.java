package javaCodingExercise;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(3, 3);
        Rectangle rectangle3 = new Rectangle(10, 1);
        Rectangle rectangle4 = new Rectangle(0, 7);

        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());
        System.out.println(rectangle4.area());
    }
}