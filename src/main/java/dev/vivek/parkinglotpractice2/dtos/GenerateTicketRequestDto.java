package dev.vivek.parkinglotpractice2.dtos;


import dev.vivek.parkinglotpractice2.models.EntryGate;
import dev.vivek.parkinglotpractice2.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDto {
    private Vehicle vehicle;
    private EntryGate entryGate;
    private Long parkingLotId;

}
