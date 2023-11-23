package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.PaymentMode;
import dev.vivek.parkinglotpractice2.models.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
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
public class Payment extends BaseModel{
    private String referenceNumber;
    private Double amount;
    private Date timeOfPayment;
    @OneToOne
    private Invoice invoice;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}
