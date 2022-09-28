package com.github.Jaskee.plantbot.command;

/**
 * enumeration for {@link Command}'s.
 */

public enum CommandName {
    START("/start"),
    STOP("/stop"),
    WATER("/water"),
    SWAP("/swap"),
    FERTILIZER("/fert"),
    HELP("/help"),
    NO("");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
