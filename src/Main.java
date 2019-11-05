import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> todoSet = new HashSet<>();


        for (; ; ) {
            String[] taskText;
            String text = scanner.nextLine();

            if (text.matches("^LIST$")) {   // LIST
                System.out.println("Список электронных адресов: ");
                for (String word : todoSet) {
                    System.out.println(word);
                }
            }


            if (text.matches("^ADD .+")) {  // ADD
                taskText = text.split("^ADD ");
                String email = taskText[1].toLowerCase();
                if (email.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,}$")) {
                    if (!todoSet.contains(email)) {
                        todoSet.add(email);
                        System.out.println("Email добавлен");
                    }
                    else{
                        System.out.println("Такой email уже сохранен");
                    }
                } else {
                    System.out.println("Email не корректен, введите заново");

                }
            }
        }
    }
}

