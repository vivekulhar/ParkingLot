package dev.vivek.parkinglotpractice2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Operator extends BaseModel{
    private String name;
    @OneToMany(mappedBy = "generatedBy")
    List<Ticket> ticket;
}
