package annotation.deprecated;

public class DeprecatedMain {
    public static void main(String[] args) {
        OldLibrary oldLibrary = new OldLibrary();
        oldLibrary.printMassage();

        NewLibrary newLibrary = new NewLibrary();
        newLibrary.printMessage();
    }
}
