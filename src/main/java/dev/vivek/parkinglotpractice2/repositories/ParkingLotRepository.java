package dev.vivek.parkinglotpractice2.repositories;

import dev.vivek.parkinglotpractice2.models.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot,Long> {
    ParkingLot save(ParkingLot parkingLot);
    ParkingLot getParkingLotById(Long id);

    //ParkingLot updateParkingLotByAddress(Long id, ParkingLot parkingLot);

    List<ParkingLot> findAll();
}
