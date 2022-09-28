package com.github.Jaskee.plantbot.command;

import com.github.Jaskee.plantbot.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {
        void execute(Update update);
}
