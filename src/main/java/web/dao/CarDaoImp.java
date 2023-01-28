package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Repository
public class CarDaoImp implements CarDao {

    List<Car> cars = new ArrayList<>(Stream.of(
            new Car("model1", 1, "blue"),
            new Car("model2", 2, "red"),
            new Car("model3", 3, "green"),
            new Car("model4", 4, "yellow"),
            new Car("model5", 5, "pink")
    ).toList());

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
