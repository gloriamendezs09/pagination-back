package com.paginationback.service;

import com.paginationback.entity.Country;
import com.paginationback.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CountryService {

    @Autowired
    public CountryRepository countryRepository;

    public Page<Country> pages(Pageable pageable){
        return countryRepository.findAll(pageable);
    }
}
