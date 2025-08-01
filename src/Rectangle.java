public class Rectangle implements Shape{
    
    int height;
    int width;

    public Rectangle(int h, int w){
        this.height = h;
        this.width = w;
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
