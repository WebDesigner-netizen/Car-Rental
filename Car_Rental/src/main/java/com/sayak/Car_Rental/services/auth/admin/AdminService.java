package com.sayak.Car_Rental.services.auth.admin;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;

import com.sayak.Car_Rental.dto.BookACarDto;
import com.sayak.Car_Rental.dto.CarDto;
import com.sayak.Car_Rental.dto.CarDtoListDto;
import com.sayak.Car_Rental.dto.SearchCarDto;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;
    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long carId, CarDto carDto) throws IOException;

    List<BookACarDto> getBookings();

    boolean changeBookingStatus(Long bookingId, String status);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);


}
