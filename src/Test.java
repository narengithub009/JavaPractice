public class Test extends AreaCal implements Payment {
    Test(int length, int breadth) {
        super(length, breadth);
    }

    public Test() {
        super();
    }

    @Override
    public void getArea() {
        System.out.println("Child class calling");
    }
    //@Override
    public static void staticMethod(){
        System.out.println("Child static method");
    }

    @Override
    public void addCoupon() {
        Payment.super.addCoupon();
    }

    @Override
    public void sum() {
        System.out.println("Sum is : "+(10+10));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Good bye 2022");
        System.out.println("Welcome 2023");
        AreaCal test=new Test(12,3);
        test.getArea();
        AreaCal.staticMethod();
        Test.staticMethod();
        Test test1=new Test();
        test1.addCoupon();
        test1.sum();
    }


}
