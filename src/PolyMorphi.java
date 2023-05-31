public class PolyMorphi {
    public static void main(String[] args) {
        Polygon polygon=new Polygon();
        polygon.rendor();
        Square square=new Square();
        square.rendor();
        Circle circle=new Circle();
        circle.rendor();
    }

}

class Polygon{
    public void rendor(){
        System.out.println("Rendering polygon");
    }

}

class Square extends Polygon{
    @Override
    public void rendor() {
        System.out.println("Rendering square");
    }
}
class Circle extends Polygon{
    @Override
    public void rendor() {
        System.out.println("Rendering circle");
    }
}
