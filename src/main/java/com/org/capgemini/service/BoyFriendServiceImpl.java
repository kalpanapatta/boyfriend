package com.org.capgemini.service;

import com.org.capgemini.model.BoyFriends;
import com.org.capgemini.repositry.BoyFriendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class BoyFriendServiceImpl implements BoyFriendService{
    @Autowired
    BoyFriendRepo boyFriendRepo;

    @Override
    public void addBoyFriend(BoyFriends boyfriends) {
        boyFriendRepo.save(boyfriends);

    }

    @Override
    public BoyFriends getById(int id) {
      BoyFriends l= boyFriendRepo.getById(id);
        return l;
    }

    @Override
    public List<BoyFriends> getAll() {
      List<BoyFriends> boys= boyFriendRepo.findAll();
        return boys;
    }

    @Override
    public void updateBoyFriend(BoyFriends boyfriends) {
        boyFriendRepo.save(boyfriends);
    }

    @Override
    public String deleteById(int id) {
       boyFriendRepo.deleteById(id);
        return "success fully deleted";



}


}
