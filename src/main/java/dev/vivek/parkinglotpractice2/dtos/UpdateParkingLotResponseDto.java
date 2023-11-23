package dev.vivek.parkinglotpractice2.dtos;

import dev.vivek.parkinglotpractice2.models.ParkingLot;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateParkingLotResponseDto extends ResponseDto{
    private ParkingLot parkingLot;
}
