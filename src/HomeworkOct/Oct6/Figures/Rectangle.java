package HomeworkOct.Oct6.Figures;

public class Rectangle extends Shape {
    public int length,height;

    public Rectangle(int length,int height){
        this.length = length;
        this.height = height;
    }

    @Override
    public double area() {
        return length*height;
    }
}
