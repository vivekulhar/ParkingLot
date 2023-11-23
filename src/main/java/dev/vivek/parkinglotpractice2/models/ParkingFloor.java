package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ParkingFloor extends BaseModel{
    @OneToMany(mappedBy = "parkingFloor")
    List<ParkingSpot> parkingSpotList;
    private int floornumber;
    @ManyToOne
    ParkingLot parkingLot;
}
