package dev.vivek.parkinglotpractice2.repositories;

import dev.vivek.parkinglotpractice2.models.Ticket;
import jakarta.persistence.OneToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findAllByParkingLotId(Long parkingLotId);
    @Override
    Ticket save(Ticket ticket);
}
