package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Vehicle extends BaseModel{
    private String number;
    @Enumerated(EnumType.ORDINAL)
    private VehicleType vehicleType;
    @OneToMany(mappedBy = "vehicle")
    List<Ticket> ticket;
}
