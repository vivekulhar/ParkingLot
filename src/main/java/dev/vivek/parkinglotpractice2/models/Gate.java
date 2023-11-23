package dev.vivek.parkinglotpractice2.models;

import dev.vivek.parkinglotpractice2.models.enums.GateStatus;
import dev.vivek.parkinglotpractice2.models.enums.GateType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class Gate extends BaseModel{
    private int number;
    @Enumerated(EnumType.ORDINAL)
    private GateType gateType;
    @OneToOne
    private Operator operator;
    @Enumerated(EnumType.ORDINAL)
    private GateStatus gateStatus;
}
