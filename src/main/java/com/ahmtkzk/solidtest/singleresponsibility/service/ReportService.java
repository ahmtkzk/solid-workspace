package com.ahmtkzk.solidtest.singleresponsibility.service;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public void generateReport(){
        System.out.println("Generating Report");
    }

}
