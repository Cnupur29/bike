package com.ngo.bike.repository;

import com.ngo.bike.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
