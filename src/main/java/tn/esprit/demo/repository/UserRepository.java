package tn.esprit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository <User,Long>{

}
