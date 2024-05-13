package com.sayak.Car_Rental.services.auth;

import com.sayak.Car_Rental.dto.SignupRequest;
import com.sayak.Car_Rental.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);

}
