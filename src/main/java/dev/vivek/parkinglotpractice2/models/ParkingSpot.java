package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.ParkingSpotStatus;
import dev.vivek.parkinglotpractice2.models.enums.SpotType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ParkingSpot extends BaseModel{
    private int spotNumber;
    @ManyToOne
    private ParkingFloor parkingFloor;
    @Enumerated(EnumType.ORDINAL)
    private SpotType spotType;
    @Enumerated(EnumType.ORDINAL)
    private ParkingSpotStatus parkingSpotStatus;
    @OneToMany(mappedBy = "parkingSpot")
    List<Ticket> tickets;

    
}
