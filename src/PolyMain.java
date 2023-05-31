public class PolyMain {
    public static void main(String[] args) {
        Java java=new Java();
        java.displayInfo();

        Language language=new Language();
        language.displayInfo();
    }
}

class Language{
    public void displayInfo(){
        System.out.println("Common English language");
    }
}

 class Java extends Language{
    @Override
    public void displayInfo() {
        System.out.println("Java Language");
    }
}
