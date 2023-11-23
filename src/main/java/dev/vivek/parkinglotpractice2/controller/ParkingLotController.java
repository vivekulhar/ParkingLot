package dev.vivek.parkinglotpractice2.controller;

import dev.vivek.parkinglotpractice2.dtos.*;
import dev.vivek.parkinglotpractice2.models.ParkingFloor;
import dev.vivek.parkinglotpractice2.models.ParkingLot;
import dev.vivek.parkinglotpractice2.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/parking-lot")
public class ParkingLotController {
    private ParkingLotService parkingLotService;
    @Autowired
    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping(path = "/create")
    public CreateParkingLotResponseDto createParkingLotResponseDto(@RequestBody CreateParkingLotRequestDto requestDto){
        if(requestDto.getNumberOfFloors()<2){
            CreateParkingLotResponseDto responseDto = new CreateParkingLotResponseDto();
            responseDto.setResponseStatusDto(ResponseStatusDto.FAILURE);
            return responseDto;
        }
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(requestDto.getAddress());
        List<ParkingFloor> parkingFloorList = new ArrayList<>();

        for(int i=0; i< requestDto.getNumberOfFloors(); i++){
            parkingFloorList.add(new ParkingFloor());
        }
        parkingLot.setParkingFloors(parkingFloorList);
        ParkingLot createdParkingLot = parkingLotService.createParkingLot(parkingLot);
        CreateParkingLotResponseDto responseDto = new CreateParkingLotResponseDto();
        responseDto.setParkingLot(createdParkingLot);
        responseDto.setResponseStatusDto(ResponseStatusDto.SUCCESS);
        return responseDto;
    }
    @PostMapping(path = "/update")
    public UpdateParkingLotResponseDto updateAddress(@RequestBody
            UpdateParkingLotRequestDto requestDto)
    {
        ParkingLot updatedParkingLot = parkingLotService.updateAddress(
                requestDto.getParkingLotId(), requestDto.getAddress());
        UpdateParkingLotResponseDto responseDto = new UpdateParkingLotResponseDto();
        responseDto.setParkingLot(updatedParkingLot);
        responseDto.setResponseStatusDto(ResponseStatusDto.SUCCESS);
        return responseDto;
    }

    @GetMapping(path = "/get-all")
    public List<ParkingLot> getAllParkingLots(){
        return parkingLotService.getAllParkingLots();
    }
}
