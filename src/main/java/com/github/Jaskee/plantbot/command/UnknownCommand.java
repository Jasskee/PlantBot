package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import com.github.Jaskee.plantbot.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String UNKNOWN_COMMAND = "Я не знаю такой команды, напишите /help для получения списка команд";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_COMMAND);
    }
}
