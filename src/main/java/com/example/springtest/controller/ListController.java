package com.example.springtest.controller;

import com.example.springtest.domain.model.DetailedListDto;
import com.example.springtest.domain.model.FilterListDto;
import com.example.springtest.domain.model.ShortListDto;
import com.example.springtest.service.ListServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    @Lazy
    private ListServiceImpl listService;

    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    DetailedListDto create(ShortListDto dto){
        return listService.create(dto);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    DetailedListDto findOne(@PathVariable UUID id){
        return listService.findOne(id);
    }

    @PostMapping(path = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ShortListDto> findAll(@RequestBody FilterListDto filter){
        return listService.findAll(filter);
    }

    @DeleteMapping
    void delete(@RequestBody Set<UUID> ids){
        listService.delete(ids);
    }
}
