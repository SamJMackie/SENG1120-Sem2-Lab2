public class Rectangle extends AbstractShape {
    
    int height;
    int width;

    public Rectangle(int h, int w){
        this.height = h;
        this.width = w;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }

    @Override
    public double area(){
        return height * width;
    }

    @Override
    public double perimeter(){
        return (height + width) * 2;
    }
}
