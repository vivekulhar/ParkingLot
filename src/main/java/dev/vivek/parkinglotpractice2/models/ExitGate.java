package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.DisplayBoard;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExitGate extends Gate{
    private DisplayBoard displayBoard;

    @ManyToOne
    private ParkingLot parkingLot;
}
