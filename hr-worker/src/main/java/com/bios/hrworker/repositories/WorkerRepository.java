package com.bios.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bios.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
