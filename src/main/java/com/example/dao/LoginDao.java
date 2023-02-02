package com.example.dao;

import com.example.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface LoginDao extends CrudRepository<User, Long>{

    List<User> findByUserName(String name);

}
