package com.web.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.jpa.domain.UserVO;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {

}