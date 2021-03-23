package com.stpunk47.springsecuritydemo2.restcontroller;


import com.stpunk47.springsecuritydemo2.model.Developer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperRestControllerV1 {

    private List<Developer> developerList = Stream.of(
            new Developer(1L,"Alex","Alexandrov"),
            new Developer(2L,"Bogdan", "Bogdanov"),
            new Developer(3L,"Chris","Cole")
    ).collect(Collectors.toList());

    @GetMapping
    public List<Developer> getAll(){
        return developerList;
    }

    @GetMapping("/{id}")
    public Developer getById(@PathVariable Long id){
        return developerList.stream().filter(developer -> developer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }



}
