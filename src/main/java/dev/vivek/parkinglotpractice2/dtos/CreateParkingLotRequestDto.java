package dev.vivek.parkinglotpractice2.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotRequestDto {
    String address;
    int numberOfFloors;
    String name;
}
