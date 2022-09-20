import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return (car2.id < car1.id) ? -1 : ((car2.id == car1.id) ? 0 : 1);
    }
}
