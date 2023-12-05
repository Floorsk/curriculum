package com.floorsk.curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmail(String email);
}