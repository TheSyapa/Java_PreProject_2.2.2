package web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> showCars(int count) {
        return carDao.showCars(count);
    }
}
