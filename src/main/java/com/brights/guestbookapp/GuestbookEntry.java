package com.brights.guestbookapp;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

//@Entity
public class GuestbookEntry {

    // fields
    @Getter @Setter
    Integer id;

    @Getter @Setter
    String name;

    @Getter @Setter
    String message;

    //constructor
    public GuestbookEntry(String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

//    @Autowired
    public GuestbookEntry() {}

}
