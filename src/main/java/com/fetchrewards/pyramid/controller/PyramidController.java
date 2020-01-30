package com.fetchrewards.pyramid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.fetchrewards.pyramid.service.PyramidService.countOccurrencesOfUniqueCharacters;
import static com.fetchrewards.pyramid.service.PyramidService.isPyramid;

@RestController
public class PyramidController {

    @GetMapping(value = "/{testString}")
    public boolean isPyramidString(@PathVariable ("testString") String testString) {
        return isPyramid(countOccurrencesOfUniqueCharacters(testString));
    }
}
