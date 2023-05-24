package com.brights.guestbookapp.services;

import com.brights.guestbookapp.GuestbookEntry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// assertEquals method
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GuestbookServiceTest {

    GuestbookService testObj;

    @BeforeEach
    void setUp(){
        this.testObj = new GuestbookService();
        System.out.println("Before");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Clean up after Test");
    }

    @Test
    void testCreateEntry() {
        GuestbookEntry testEntry = new GuestbookEntry("Toni", "Hey");
        testObj.createEntry(testEntry);
        List<GuestbookEntry> testBook = new ArrayList<>();
        testBook.add(testEntry);
//        assertEquals(testObj.guestbook.get(0).getName(), testBook.get(0).getName());
//        assertEquals(testObj.guestbook.get(0).getMessage(), testBook.get(0).getMessage());
        assertIterableEquals(testBook, testObj.guestbook);
    }
}
