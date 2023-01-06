public interface Payment {

    default void addCoupon(){
        System.out.println("Add 5 rs Cashback");
    }
    static void generateTransactionReport(){
        System.out.println("Generate Monthly Transaction : ");
    }

    void sum();
}
