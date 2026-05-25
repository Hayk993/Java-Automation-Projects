package homework.task23;

public class User implements Identifiable<Integer> {
    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
