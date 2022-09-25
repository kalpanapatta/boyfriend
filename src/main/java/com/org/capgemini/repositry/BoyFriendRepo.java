package com.org.capgemini.repositry;

import com.org.capgemini.model.BoyFriends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoyFriendRepo extends JpaRepository< BoyFriends,Integer> {

}
