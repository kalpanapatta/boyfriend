package com.org.capgemini.service;

import com.org.capgemini.model.BoyFriends;
import com.org.capgemini.repositry.BoyFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoyFriendServiceImpl implements BoyFriendService{
    @Autowired
    BoyFriendRepo boyFriendRepo;

    @Override
    public void addBoyFriend(BoyFriends boyfriends) {
        boyFriendRepo.save(boyfriends);

    }
}
