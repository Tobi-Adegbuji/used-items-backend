package com.useditems.useditemsbackend.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String year;

    private double price;

    private String description;

    @Enumerated(EnumType.STRING)
    private Condition condition;

    private String email;
}
