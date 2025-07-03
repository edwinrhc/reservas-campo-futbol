package com.erhc.app.repository;


import com.erhc.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//pendiente: Agregar los métodos
public interface UserRepository extends JpaRepository<User, UUID> {


}
