package dev.vivek.parkinglotpractice2.dtos;


import dev.vivek.parkinglotpractice2.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketResponseDto extends ResponseDto{
    private Ticket ticket;
}
