package Atv3;

// Example of execution
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular(Subject.SCIENCE);
        System.out.println(titular.teach()); // -> "Ensino de ciências"

        Substitute substitute = new Substitute();
        substitute.assign(Subject.SCIENCE);
        substitute.assign(Subject.GYMNASTICS);
        substitute.assign(Subject.MUSIC);

        System.out.println(substitute.teach()); // -> "Ensino de ciências"
        System.out.println(substitute.teach()); // -> "Ditando ginástica"
        System.out.println(substitute.teach()); // -> "Ensinar música"
    }
}
