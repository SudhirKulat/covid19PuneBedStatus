package com.covid19pune.covidbeds.controller;

import com.covid19pune.covidbeds.model.CovidHospital;
import com.covid19pune.covidbeds.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class CovidHospitalController {

    @Autowired
    private BedService bedService;

    @RequestMapping(value = "/getBedDetails", method = RequestMethod.GET)
    public List<CovidHospital> getBedDetails() throws IOException {
        return bedService.getBeds();
    }
}
