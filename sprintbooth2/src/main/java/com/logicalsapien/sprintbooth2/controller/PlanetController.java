package com.logicalsapien.springbootrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetController {

    /**
     * get Api to return list of all planets.
     * @return List of Planets
     */
    @GetMapping()
    public ResponseEntity<List<String>> listAllPlanets() {
        List<String> planetList
                = List.of("Mercury", "Venus", "Earth", "Mars",
                            "Jupiter", "Saturn", "Uranus", "Neptune");
        return new ResponseEntity<>(planetList, HttpStatus.OK);
    }
}
