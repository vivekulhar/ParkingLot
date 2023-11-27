package dev.vivek.parkinglotpractice2.services;

import dev.vivek.parkinglotpractice2.models.*;
import dev.vivek.parkinglotpractice2.models.enums.SpotType;
import dev.vivek.parkinglotpractice2.repositories.ParkingLotRepository;
import dev.vivek.parkinglotpractice2.repositories.TicketRepository;
import dev.vivek.parkinglotpractice2.strategies.spotassignmentstrategy.SpotAssignmentStrategy;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(
            Long parkingLotId,
            Vehicle vehicle,
            SpotType spotType,
            EntryGate entryGate){

        ParkingLot parkingLot = parkingLotRepository.getById(parkingLotId);
        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(
                parkingLot,
                spotType,
                entryGate
        );

        if(parkingLot==null){
            return null;
        }

        Ticket ticket = new Ticket();
        ticket.setEntryGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());

        ticketRepository.save(ticket);
        return ticket;
    }
}
