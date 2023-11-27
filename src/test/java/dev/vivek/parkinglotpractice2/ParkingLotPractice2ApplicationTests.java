package dev.vivek.parkinglotpractice2;

import dev.vivek.parkinglotpractice2.models.ParkingLot;
import dev.vivek.parkinglotpractice2.models.enums.VehicleType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingLotPractice2ApplicationTests {

    @Test
    void contextLoads() {

    }
    @ParameterizedTest
    @EnumSource(VehicleType.class)
    void testVehicleType(VehicleType vehicleType){
        System.out.println(vehicleType);
    }
    @Test
    void testCreateParkingLot(){
        // 1. Create a parking lot
        // 2. Create a vehicle
        // 3. Create a ticket
        // 4. Assign ticket to vehicle
        // 5. Assign vehicle to parking lot
        // 6. Save parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Kathmandu");

        parkingLot.setParkingFloors(null);
        parkingLot.setEntryGateList(null);
        parkingLot.setExitGateList(null);

        System.out.println("Parking Lot: "+parkingLot);

    }
}
