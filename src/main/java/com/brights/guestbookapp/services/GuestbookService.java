package com.brights.guestbookapp.services;

import com.brights.guestbookapp.GuestbookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestbookService {

    public List<GuestbookEntry> guestbook;

    @Autowired
    public GuestbookService() {
        this.guestbook = new ArrayList<>();
    }

    public void createEntry(GuestbookEntry entry) {
        guestbook.add(entry);
    }

    public List<GuestbookEntry> findAll() {
        return guestbook;
    }

}
