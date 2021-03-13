package com.school.mindera.rentacar.persistence.entity;

import com.school.mindera.rentacar.enumerators.CarBrands;
import com.school.mindera.rentacar.enumerators.CarSegment;
import com.school.mindera.rentacar.enumerators.EngineType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class CarEntity extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private CarBrands brand;

    @Column(nullable = false)
    private String modelDescription;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private EngineType engineType;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private CarSegment carSegment;

    @Column(nullable = false)
    private Date dateOfPurchase;

    @Column(nullable = false, length = 8, unique = true)
    private String plate;

    @Column(nullable = false)
    private boolean available;
}
