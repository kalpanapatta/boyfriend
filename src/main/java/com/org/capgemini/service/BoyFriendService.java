package com.org.capgemini.service;

import com.org.capgemini.model.BoyFriends;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BoyFriendService {
    public void addBoyFriend( BoyFriends boyfriends);
    public BoyFriends getById( int id);
    public List<BoyFriends>  getAll();
    public void updateBoyFriend( BoyFriends boyfriends);

    String deleteById(int id);
}
