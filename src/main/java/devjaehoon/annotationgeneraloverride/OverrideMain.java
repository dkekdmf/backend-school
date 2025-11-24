package devjaehoon.annotationgeneraloverride;

public class OverrideMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.printMassage();
        p1.printMessageNotOverride();

        Parent p2 = new Child();
        p2.printMassage();
        p2.printMessageNotOverride();
    }
}
