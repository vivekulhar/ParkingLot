package dev.vivek.parkinglotpractice2.strategies.spotassignmentstrategy;

import dev.vivek.parkinglotpractice2.models.EntryGate;
import dev.vivek.parkinglotpractice2.models.ParkingLot;
import dev.vivek.parkinglotpractice2.models.ParkingSpot;
import dev.vivek.parkinglotpractice2.models.enums.SpotType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(ParkingLot parkingLot,
                           SpotType spotType,
                           EntryGate entryGate);
}
