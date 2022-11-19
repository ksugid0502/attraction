import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> q = new ArrayDeque<>();

        for (int i = 0; i < generateClients().size(); i++) {
            q.push(generateClients().get(i));
        }

        while (!q.isEmpty()) {
            Person p = q.pop();
            p.tickets = p.tickets - 1;
            System.out.println(p.name + " " + p.surname + " прокатился на аттракционе. " +
                    "Осталось билетов: " + p.tickets);
            if (p.tickets != 0) {
                q.addLast(p);
            }

        }
    }


    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        Person person1 = new Person("Sergey", "Nikolaev", 6);
        Person person2 = new Person("Klim", "Nikolaev", 7);
        Person person3 = new Person("Veronica", "Lebedeva", 8);
        Person person4 = new Person("Nikita", "Sobolev", 3);
        Person person5 = new Person("Olga", "Morozova", 1);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }
}
