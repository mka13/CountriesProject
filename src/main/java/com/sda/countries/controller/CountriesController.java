package com.sda.countries.controller;

import com.sda.countries.model.Country;
import com.sda.countries.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CountriesController {
    CountryService countryService;
    @Autowired
    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ModelAndView countries(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.addObject("countries");
        return modelAndView;
    }


}
