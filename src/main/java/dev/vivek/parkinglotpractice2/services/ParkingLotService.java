package dev.vivek.parkinglotpractice2.services;

import dev.vivek.parkinglotpractice2.models.ParkingLot;
import dev.vivek.parkinglotpractice2.repositories.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        return parkingLotRepository.save(parkingLot);
    }

    public ParkingLot updateAddress(Long id, String newAddress){
        // 1, Get Current Parking lot
//        2. Update the address
//                3. Save
//            4. Return

        ParkingLot currentParkingLot = parkingLotRepository.getById(id);
        currentParkingLot.setAddress(newAddress);
        ParkingLot updatedParkingLot = parkingLotRepository.save(currentParkingLot);
        return updatedParkingLot;
    }

    public List<ParkingLot> getAllParkingLots() {
        return parkingLotRepository.findAll();
    }
}
