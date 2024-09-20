package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars(int value) {
        createListOfCars();
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < value && i < cars.size(); i++) {
            result.add(cars.get(i));
        }
        return result;
    }

    @Override
    public void createListOfCars() {
        if (cars.isEmpty()) {
            cars.add(new Car(1,1, "model1"));
            cars.add(new Car(2,2, "model2"));
            cars.add(new Car(3,3, "model3"));
            cars.add(new Car(4,4, "model4"));
            cars.add(new Car(5,5, "model5"));
        }
    }
}