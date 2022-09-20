import java.util.UUID;

public class Car{
    int id;
    int numberOfWheels;
    String uuid = UUID.randomUUID().toString();

    public Car(int id) {
        this.id = id;
    }
}
