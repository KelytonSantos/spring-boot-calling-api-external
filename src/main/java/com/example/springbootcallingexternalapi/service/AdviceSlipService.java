package com.example.springbootcallingexternalapi.service;

import org.springframework.stereotype.Service;

import com.example.springbootcallingexternalapi.model.AdviceSlip;
import com.example.springbootcallingexternalapi.repository.AdviceSlipRepository;

@Service
public class AdviceSlipService {
    
    public AdviceSlipRepository adviceSlipRepository;

    public AdviceSlip save(AdviceSlip text){
        return adviceSlipRepository.save(text);
    }
}