package com.fetchrewards.pyramid.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PyramidService {

    /**
     * This method counts the occurrence of distinct characters in the supplied string.
     * It will then return a List of integers with the counts in ascending order
     * @param testString
     * @return List
     */
    public static List<Integer> countOccurrencesOfUniqueCharacters(String testString) {
        return testString.toLowerCase()
                .chars()
                .distinct()
                .map(ch -> StringUtils.countMatches(testString, String.valueOf((char) ch)))
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * This takes the input of List of integers in ascending order and checks if the
     * numbers are consecutive.
     * @param charCountList
     * @return true if numbers are consecutive
     *         false if numbers are not consecutive
     */
    public static boolean isPyramid(List<Integer> charCountList) {
        for(int i=1; i<charCountList.size(); i++) {
            if(charCountList.get(i-1) + 1 != charCountList.get(i)) {
                return false;
            }
        }
        return true;
    }
}
