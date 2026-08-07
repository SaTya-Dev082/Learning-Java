package Generics;


interface Repository<T, ID> {
    void save(T item);

    T findById(ID id);
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class UserRepository implements Repository<User, Integer> {

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }

    @Override
    public User findById(Integer id) {
        return new User(id, "Makara");
    }
}


public class GenericInterface {
    public static void main(String[] args) {
        Repository<User, Integer> repo = new UserRepository();

        repo.save(new User(1, "Dara"));

        User user = repo.findById(10);
        System.out.println(user);
    }
}
