package com.learnkafka.controller;

import com.learnkafka.domain.LibraryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@Slf4j
public class LibraryEventsController {

    @PostMapping("/library-event")
    @ResponseStatus(HttpStatus.CREATED)
    public LibraryEvent postLibraryEvent(@RequestBody LibraryEvent libraryEvent) {
        log.info("libraryEvent triggered, {}", libraryEvent);
        return libraryEvent;
    }
}