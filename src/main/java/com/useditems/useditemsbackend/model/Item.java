package com.useditems.useditemsbackend.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {


    private String year;

    private double price;

    private String description;


    private Condition condition;

    private String email;
}
