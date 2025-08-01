public abstract class AbstractShape implements Shape{

    public void display(){
        System.out.println(area());
        System.out.println(perimeter());
    }

    public abstract String getName();

}