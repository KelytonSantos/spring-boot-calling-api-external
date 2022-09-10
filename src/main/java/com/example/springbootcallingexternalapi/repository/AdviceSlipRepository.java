package com.example.springbootcallingexternalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcallingexternalapi.model.AdviceSlip;

public interface AdviceSlipRepository extends JpaRepository<AdviceSlip, Long>{
    
}