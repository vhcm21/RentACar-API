package com.school.mindera.rentacar.enumerators;

public enum CarBrands {
    MERCEDES("Mercedes-Benz"),
    BMW("BMW"),
    AUDI("Audi"),
    VOLKSWAGEN("Volkswagen"),
    SKODA("Skoda"),
    SEAT("Seat"),
    PORSCHE("Porsche"),
    FERRARI("Ferrari"),
    RENAULT("Renault"),
    CITROEN("Citroen"),
    PEUGEOT("Peugeot"),
    FIAT("Fiat"),
    TOYOTA("Toyota"),
    HYUNDAI("Hyundai"),
    HONDA("Honda"),
    KIA("Kia"),
    DACIA("Dacia"),
    BENTLEY("Bentley"),
    NISSAN("Nissan"),
    OPEL("Open"),
    TESLA("Tesla"),
    CHEVROLET("Chevrolet"),
    FORD("Ford");

    private String name;

    CarBrands(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
