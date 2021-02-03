package example2;

public class RightTriangle extends Figure{
    public RightTriangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    public double area() {
        return dimension1 * dimension2/2;
    }

    @Override
    public double perimeter() {
        return dimension1 + dimension2 + hypothesis();
    }

    private double hypothesis(){
        return Math.sqrt(dimension1*dimension1+dimension2*dimension2);
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "dimension1=" + dimension1 +
                ", dimension2="+ dimension2+
                ", perimeter="+perimeter()+
                ", area=" + area()+'}';
    }

    @Override
    public void printInfo() {
        System.out.println("1-й катет треугольника= " + dimension1);
        System.out.println("2-й катет треугольника=  " + dimension2);
    }

}
