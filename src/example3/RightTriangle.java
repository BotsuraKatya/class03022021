package example3;

public class RightTriangle implements AreaCalculator, PerimeterCalculator{
    private double dimension1;
    private double dimension2;

    public RightTriangle(int dimension1, int dimension2){
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    @Override
    public double area() {
        return dimension1 * dimension2 / 2;
    }

    @Override
    public double perimeter() {
        return dimension1 + dimension2 + hypothesis();
    }

    private double hypothesis(){
        return  Math.sqrt(dimension1*dimension1+ dimension2*dimension2);
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "dimension1=" + dimension1 +
                ", dimension2="+ dimension2+
                ", perimeter="+perimeter()+
                ", area=" + area()+'}';
    }
}
