package com.marsrover.nasa.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandService {

    private final ApplicationContext applicationContext;


    public CommandService(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void runCommands(List<String> commands) {
        commands.forEach(command ->
                
    }

}
