package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class ElectricCharger extends BaseModel{
    @ManyToOne
    ElectricParkingSpot electricParkingSpot;
}
