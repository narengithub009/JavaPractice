public class AmazonPay implements UPIPayment{

    @Override
    public String doPayment(String source, String dest) {
        return "Do Payment return value";
    }
}
