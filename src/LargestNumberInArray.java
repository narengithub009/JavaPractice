public class LargestNumberInArray {
    private String formatNumber(int value){
        return String.format("%d",value);
    }
    private String formatNumber(double value){
        return String.format("%.3f",value);
    }
    private String formatNumber(String value){
        return String.format("%.2f",Double.parseDouble(value));
    }

    public static void main(String[] args) {
        LargestNumberInArray largestNumberInArray=new LargestNumberInArray();
        System.out.println(largestNumberInArray.formatNumber(20));
        System.out.println(largestNumberInArray.formatNumber(12.77080));
        System.out.println(largestNumberInArray.formatNumber("123"));
    }
}
