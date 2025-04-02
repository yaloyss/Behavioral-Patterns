package Observer;

//конкретний спостерігач - користувач
public class User implements Observer {
    private String name;

    public User(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String availabilityStatus)
    {
        System.out.println(name + " received a message: " + availabilityStatus);
    }
}