package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.Entity;
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
public class ElectricParkingSpot extends BaseModel{
    @OneToMany(mappedBy = "electricParkingSpot")
    private List<ElectricCharger> electricCharger;
}
