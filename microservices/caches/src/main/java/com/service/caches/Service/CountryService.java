package com.service.caches.Service;

import com.service.caches.Entity.Country;
import com.service.caches.Repository.CountryRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Cacheable(value = "countries")
    public List<Country> getAllCountries() {
        System.out.println("DB HIT - fetching all countries");
        return countryRepository.findAll();
    }

    @CacheEvict(value = "countries", allEntries = true)
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
}