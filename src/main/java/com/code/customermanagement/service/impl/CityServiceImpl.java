package com.code.customermanagement.service.impl;

import com.code.customermanagement.entity.City;
import com.code.customermanagement.repository.CityRepository;
import com.code.customermanagement.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

}
