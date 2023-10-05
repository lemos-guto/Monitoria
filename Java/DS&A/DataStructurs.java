import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DataStructurs {
    public static void main(String[] args) {
        Stack<String> people = new Stack<String>();

        people.push("Marceline");
        people.push("Mateus Cruzatto");
        people.push("Marshaw Lee");
        people.push("Rowlet");
        people.push("Akali");
        people.push("Zeri");

        people.pop();

        System.out.println(people);

        Queue<String> skins = new LinkedList<>();
        skins.offer("Coven Nami");
        skins.offer("Coven Akali");
        skins.offer("Coven Sydra");
        skins.offer("Coven Elise");
        skins.offer("Coven Nilah");

        System.out.println(skins.element());

        /*
         * for (String pessoa : people) {
         * System.out.println(pessoa);
         * }
         */
    }
}