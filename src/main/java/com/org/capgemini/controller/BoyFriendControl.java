package com.org.capgemini.controller;

import com.org.capgemini.model.BoyFriends;
import com.org.capgemini.service.BoyFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class BoyFriendControl {
    @Autowired
    BoyFriendService boyFriendService;
    //CRUD//
    @PostMapping("/create")
    public void addBoyFriend(@RequestBody BoyFriends boyfriends){
        boyFriendService.addBoyFriend(boyfriends);

    }

}
