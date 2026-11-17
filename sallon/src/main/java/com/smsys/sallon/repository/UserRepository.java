package com.smsys.sallon.repository;

import com.smsys.sallon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
