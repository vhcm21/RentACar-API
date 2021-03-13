package com.school.mindera.rentacar.converter;

import com.school.mindera.rentacar.command.CarDetailsDto;
import com.school.mindera.rentacar.command.CreateOrUpdateCarDto;
import com.school.mindera.rentacar.persistence.entity.CarEntity;

public class CarConverter {

    public static CarDetailsDto fromCarEntityToCarDetailsDto(CarEntity carEntity) {
        return CarDetailsDto.builder()
                .carId(carEntity.getCarId())
                .brand(carEntity.getBrand())
                .modelDescription(carEntity.getModelDescription())
                .engineType(carEntity.getEngineType())
                .dateOfPurchase(carEntity.getDateOfPurchase())
                .carSegment(carEntity.getCarSegment())
                .plate(carEntity.getPlate())
                .available(carEntity.isAvailable())
                .dailyPrice(carEntity.getCarSegment().getDailyPrice())
                .build();
    }

    public static CarEntity fromCreateOrUpdateCarDtoToCarEntity(CreateOrUpdateCarDto createOrUpdateCarDto) {
        return CarEntity.builder()
                .brand(createOrUpdateCarDto.getBrand())
                .modelDescription(createOrUpdateCarDto.getModelDescription())
                .engineType(createOrUpdateCarDto.getEngineType())
                .dateOfPurchase(createOrUpdateCarDto.getDateOfPurchase())
                .carSegment(createOrUpdateCarDto.getCarSegment())
                .plate(createOrUpdateCarDto.getPlate())
                .build();
    }
}
