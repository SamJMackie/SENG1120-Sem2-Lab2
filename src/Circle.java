public class Circle extends AbstractShape {
   
    int radius;

    public Circle(int r){
        this.radius = r;
    }

    @Override
    public String getName(){
        return "Circle";
    }
    
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return Math.PI * radius * 2;
    }
}
