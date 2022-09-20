import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Классная работа");

        HashMap<String, Car> carsMap = new HashMap<>();
        String cashedCarUUID = "";

    for (int i = 0; i<100; i++){
            Car car = new Car(i);
            carsMap.put(car.uuid, car);
            if(i==27) {
                cashedCarUUID = car.uuid;
            }
        }

        Car cashedCar = carsMap.get(cashedCarUUID);
        System.out.println(cashedCar.id + " " + cashedCar.uuid);

        Integer id = 0;

        TreeMap<Car, Car> carsTreeMap = new TreeMap<>(new CarComparator());



        for (int i = 0; i<100; i++){
            Car car = new Car(i);
            carsTreeMap.put(car, car);
        }

        carsTreeMap.forEach((key, value) -> {
            System.out.println(value.id);
        });

        System.out.println();


        System.out.println("Домашняя работа");

        HashMap<Integer, MultiplicationTable> tableHashMap = new HashMap<>();

        for(int i = 1; i<=10; i++){
            System.out.print("• ");
            for (int j = 1; j <= 10; j++) {
                MultiplicationTable table = new MultiplicationTable(i, j);
            }
            System.out.println("");
        }
    }
}
