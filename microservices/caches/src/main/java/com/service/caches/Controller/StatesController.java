package com.service.caches.Controller;

import com.service.caches.Entity.State;
import com.service.caches.Service.StateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StatesController {

    private final StateService stateService;

    public StatesController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping
    public List<State> getAllStates() {
        return stateService.getAllStates();
    }

    @GetMapping("/{countryCode}")
    public List<State> getStatesByCountry(@PathVariable String countryCode) {
        return stateService.getStatesByCountryCode(countryCode);
    }

    @PostMapping
    public State addState(@RequestBody State state) {
        return stateService.addState(state);
    }
}