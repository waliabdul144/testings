package com.service.caches.Service;

import com.service.caches.Entity.Country;
import com.service.caches.Repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private static final Logger log = LoggerFactory.getLogger(CountryService.class);

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Cacheable(value = "countries")
    public List<Country> getAllCountries() {
        log.info("DB HIT - fetching all countries");
        return countryRepository.findAll();
    }

    @CacheEvict(value = "countries", allEntries = true)
    public Country addCountry(Country country) {
        log.info("Cache evicted - adding country: {}", country.getCountryCode());
        return countryRepository.save(country);
    }
}