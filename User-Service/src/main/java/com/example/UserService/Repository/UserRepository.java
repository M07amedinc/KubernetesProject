package com.example.UserService.Repository;

import com.example.UserService.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Users,Long> {
    Users findByUserId(Long userId);

}
