package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.github.Jaskee.plantbot.command.CommandName.*;

public class CommandContainer {

    private final ImmutableMap<String, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService){
        commandMap = ImmutableMap.<String, Command>builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(),  new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(),  new HelpCommand(sendBotMessageService))
                .put(FERTILIZER.getCommandName(), new FertCommand(sendBotMessageService))
                .put(SWAP.getCommandName(), new SwapCommand(sendBotMessageService))
                .put(WATER.getCommandName(), new WaterCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }

}
