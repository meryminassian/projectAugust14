package com.example.demo.persistence.repository;

import com.example.techthink.persistence.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u where u.email=?1 or u.username = ?1")
    User loadUserByUsernameOrEmail(String term);
}
