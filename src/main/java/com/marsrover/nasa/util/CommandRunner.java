package com.marsrover.nasa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {

    @Autowired
    private CommandService commandService;

    private static final String COMMAND_FILE_NAME = "commands.nasa";

    @Override
    public void run(String... args) throws Exception {

    }
}
