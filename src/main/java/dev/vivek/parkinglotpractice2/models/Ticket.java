package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ticket extends BaseModel{
    private Date entryTime;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private ParkingSpot parkingSpot;
    @ManyToOne
    private Operator generatedBy;
    @OneToOne
    private Invoice invoice;
    @OneToOne
    private Payment payment;

    private String ownerName;
    @OneToOne
    private EntryGate entryGate;
    @ManyToOne
    private ParkingLot parkingLot;
}
