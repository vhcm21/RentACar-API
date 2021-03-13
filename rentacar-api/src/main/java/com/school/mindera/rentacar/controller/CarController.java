package com.school.mindera.rentacar.controller;

import com.school.mindera.rentacar.command.CarDetailsDto;
import com.school.mindera.rentacar.command.CreateOrUpdateCarDto;
import com.school.mindera.rentacar.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarDetailsDto> createCar(@Valid @RequestBody CreateOrUpdateCarDto createOrUpdateCarDto) {
        CarDetailsDto carDetails = carService.addNewCar(createOrUpdateCarDto);
        return new ResponseEntity<>(carDetails, HttpStatus.CREATED);
    }

    @GetMapping("/{carId}")
    public ResponseEntity<CarDetailsDto> getCarById(@PathVariable long carId) {
        CarDetailsDto carDetails = carService.getCarById(carId);
        return new ResponseEntity<>(carDetails, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CarDetailsDto>> getCarsList() {
        List<CarDetailsDto> usersList = carService.getAllCars();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }

    @PutMapping("/{carId}")
    public ResponseEntity<CarDetailsDto> updateCar(@PathVariable long carId,
                                                    @Valid @RequestBody CreateOrUpdateCarDto createOrUpdateCarDto) {
        CarDetailsDto carDetailsDto = carService.updateCarDetails(carId, createOrUpdateCarDto);
        return new ResponseEntity<>(carDetailsDto, HttpStatus.OK);
    }

    @DeleteMapping("/{carId}")
    public ResponseEntity deleteUser(@PathVariable long carId) {
        carService.deleteCar(carId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
