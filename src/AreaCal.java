public class AreaCal {
    private int length;
    private int breadth;

    AreaCal(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public AreaCal() {

    }

    public void getArea()  {
        int area=length*breadth;
        System.out.println("The area is :"+area);
    }
    public static void staticMethod(){
        System.out.println("Parent static method");
    }
    public static void main(String[] args) throws Exception {
        AreaCal areaCal=new AreaCal(12,2);
        areaCal.getArea();
    }
}
