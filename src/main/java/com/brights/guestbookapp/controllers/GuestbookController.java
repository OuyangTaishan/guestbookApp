package com.brights.guestbookapp.controllers;

import com.brights.guestbookapp.GuestbookEntry;
import com.brights.guestbookapp.services.GuestbookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/guestbook")
public class GuestbookController {

    private GuestbookService guestbookService;

    @Autowired
    public GuestbookController(GuestbookService guestbookService) {
        this.guestbookService = guestbookService;
    }

    @GetMapping(value = "/show") // this is the URL
    public String show(Model model) {
        List<GuestbookEntry> guestbook = guestbookService.guestbook;
        model.addAttribute("guestBook", guestbook);
        return "/guestbook/guestbook"; // this is our folder structure
    }

    @GetMapping(value = "/form")
    public String seriesForm(Model model) {
        GuestbookEntry guest = new GuestbookEntry();
        model.addAttribute("guest", guest);
        return "/guestbook/guestbook-form";
    }

    @PostMapping(value = "/store")
    public String store(String name, String message) {
        guestbookService.createEntry(new GuestbookEntry(name, message));
        return "redirect:/guestbook/show";
    }

}
