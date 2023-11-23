package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.InvoicePaidStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice extends BaseModel{
    @OneToOne
    private Ticket ticket;
    private double amount;
    private Date exitTime;
    @ManyToOne
    private Operator operator;
    @Enumerated(EnumType.ORDINAL)
    private InvoicePaidStatus invoicePaidStatus;
}
