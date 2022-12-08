import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
        numeros.add(i);

    }
        numeros.remove(2);
        System.out.println(numeros);

}
}
