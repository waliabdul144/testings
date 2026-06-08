package com.service.caches.Service;

import com.service.caches.Entity.State;
import com.service.caches.Repository.StateRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Cacheable(value = "states")
    public List<State> getAllStates() {
        System.out.println("DB HIT - fetching all states");
        return stateRepository.findAll();
    }

    @Cacheable(value = "statesByCountry", key = "#countryCode")
    public List<State> getStatesByCountryCode(String countryCode) {
        System.out.println("DB HIT - fetching states for country: " + countryCode);
        return stateRepository.findByCountryCode(countryCode);
    }

    @CacheEvict(value = {"states", "statesByCountry"}, allEntries = true)
    public State addState(State state) {
        return stateRepository.save(state);
    }
}