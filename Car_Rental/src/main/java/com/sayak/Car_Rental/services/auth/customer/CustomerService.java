package com.sayak.Car_Rental.services.auth.customer;

import javax.swing.*;

import com.sayak.Car_Rental.dto.BookACarDto;
import com.sayak.Car_Rental.dto.CarDto;
import com.sayak.Car_Rental.dto.CarDtoListDto;
import com.sayak.Car_Rental.dto.SearchCarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

    List<BookACarDto> getBookingsByUserId(Long userId);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);

}
