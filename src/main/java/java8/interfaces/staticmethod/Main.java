package java8.interfaces.staticmethod;

public class Main {
    public static void main(String[] args) {
        StaticMethods imp = new StaticMethodsImp();

        StaticMethods.printString("Hello World!");
//        imp.printString("Overridden method!");
    }
}
