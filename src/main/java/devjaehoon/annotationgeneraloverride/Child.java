package devjaehoon.annotationgeneraloverride;

public class Child extends Parent {
    @Override
    public void printMassage() {
        System.out.println("I'm child class");
    }
}
