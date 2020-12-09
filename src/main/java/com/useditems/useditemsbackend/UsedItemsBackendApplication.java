package com.useditems.useditemsbackend;

import com.useditems.useditemsbackend.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsedItemsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsedItemsBackendApplication.class, args);

        System.out.println("Herman");
        System.out.println("Tobi");
        System.out.println("Kai");
    }

}
