package dev.vivek.parkinglotpractice2.dtos;

import dev.vivek.parkinglotpractice2.models.ParkingLot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotResponseDto extends ResponseDto{
    private ParkingLot parkingLot;
    private ResponseStatusDto responseStatusDto;

}
