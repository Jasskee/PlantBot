package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command{
    private final SendBotMessageService sendBotMessageService;

    public static final String NO_COMMAND = "Я понимаю только команды, которые начинаются на слеш(/)." +
            " Чтобы посмотреть список моих команд, напишите /help.";

    public NoCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }
    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_COMMAND);
    }
}
