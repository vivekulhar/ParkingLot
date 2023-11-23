package dev.vivek.parkinglotpractice2.controller;

import dev.vivek.parkinglotpractice2.dtos.GenerateTicketRequestDto;
import dev.vivek.parkinglotpractice2.dtos.GenerateTicketResponseDto;
import dev.vivek.parkinglotpractice2.services.TicketService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    private TicketService ticketService;
    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    @GetMapping(path = "/generate-ticket")
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        return null;
    }
}
