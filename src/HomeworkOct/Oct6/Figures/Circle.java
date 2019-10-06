package HomeworkOct.Oct6.Figures;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI;
    }
}
