package com.org.capgemini.controller;

import com.org.capgemini.model.BoyFriends;
import com.org.capgemini.service.BoyFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BoyFriendControl {
    @Autowired
    BoyFriendService boyFriendService;

    //CRUD//
    @PostMapping("/create")
    public void addBoyFriend(@RequestBody BoyFriends boyfriends) {
        boyFriendService.addBoyFriend(boyfriends);

    }

    @GetMapping("/getById/{id}")
    public BoyFriends getById(@PathVariable int id) {
        BoyFriends boys = boyFriendService.getById(id);
        return boys;
    }

    @PutMapping("/update")
    public void updateBoyFriend(@RequestBody BoyFriends boyfriends) {
        boyFriendService.updateBoyFriend(boyfriends);

    }

    @DeleteMapping("/remove/{id}")
    public String DeleteById(@PathVariable int id) {
        String s2 = boyFriendService.deleteById(id);
        return s2;


    }
}

