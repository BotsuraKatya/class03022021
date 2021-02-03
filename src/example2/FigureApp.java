package example2;

public class FigureApp {

    public static  void main(String[] args){
        Figure rightTriangle = new RightTriangle(3, 4);
        System.out.println(rightTriangle);
        rightTriangle.printInfo();

        Figure rectangle = new Rectangle(3, 4);
        System.out.println(rectangle);
        rectangle.printInfo();
    }
}
