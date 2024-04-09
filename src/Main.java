import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Employee employee = new Employee(1,"Lungile","Sifumba",6000);

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(30);
        myList.add(42);
        myList.remove(0);
        System.out.println(myList);

    }
}