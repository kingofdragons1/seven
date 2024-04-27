import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i + ":");
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя " + i + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            users.add(new User(name, age));
        }

        Collections.sort(users, Comparator.comparing(User::getAge));

        for (User user : users) {
            System.out.println(user);
        }
    }
}

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}
