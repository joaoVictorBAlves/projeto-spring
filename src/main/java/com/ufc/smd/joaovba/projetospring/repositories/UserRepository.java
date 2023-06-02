package com.ufc.smd.joaovba.projetospring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ufc.smd.joaovba.projetospring.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}