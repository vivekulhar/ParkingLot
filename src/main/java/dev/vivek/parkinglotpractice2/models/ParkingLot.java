package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.*;
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
public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    @OneToMany(mappedBy = "parkingLot")
    private List<ParkingFloor> parkingFloors;

    @OneToMany(mappedBy = "parkingLot")
    private List<EntryGate> entryGateList;

    @OneToMany(mappedBy = "parkingLot")
    private List<ExitGate> exitGateList;
}
