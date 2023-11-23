package dev.vivek.parkinglotpractice2.strategies.spotassignmentstrategy;

import dev.vivek.parkinglotpractice2.models.EntryGate;
import dev.vivek.parkinglotpractice2.models.ParkingFloor;
import dev.vivek.parkinglotpractice2.models.ParkingLot;
import dev.vivek.parkinglotpractice2.models.ParkingSpot;
import dev.vivek.parkinglotpractice2.models.enums.ParkingSpotStatus;
import dev.vivek.parkinglotpractice2.models.enums.SpotType;
import org.springframework.stereotype.Component;

@Component
public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, SpotType spotType, EntryGate entryGate) {
        for(ParkingFloor parkingFloor:parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot: parkingFloor.getParkingSpotList()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                        && parkingSpot.getSpotType().equals(spotType)){
                    return parkingSpot;
                }
            }
        }

        return null;
    }
}
