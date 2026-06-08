package com.service.caches.Service;

import com.service.caches.Entity.State;
import com.service.caches.Repository.StateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private static final Logger log = LoggerFactory.getLogger(StateService.class);

    private final StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Cacheable(value = "states")
    public List<State> getAllStates() {
        log.info("DB HIT - fetching all states");
        return stateRepository.findAll();
    }

    @Cacheable(value = "statesByCountry", key = "#countryCode")
    public List<State> getStatesByCountryCode(String countryCode) {
        log.info("DB HIT - fetching states for country: {}", countryCode);
        return stateRepository.findByCountryCode(countryCode);
    }

    @CacheEvict(value = {"states", "statesByCountry"}, allEntries = true)
    public State addState(State state) {
        log.info("Cache evicted - adding state: {}", state.getStateCode());
        return stateRepository.save(state);
    }
}