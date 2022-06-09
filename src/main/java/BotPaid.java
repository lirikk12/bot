import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotPaid  extends TelegramLongPollingBot {


    protected BotPaid(DefaultBotOptions options) {
        super(options);
    }

    @Override
    public String getBotUsername() {
        return "@lirikk12_bot";
    }

    @Override
    public String getBotToken() {
        return "536616423:AAFmrPiN1IqafQmZehbx0bZ0tSsBtHYVQ6w";
    }

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if(message.hasText()) {
                execute(SendMessage.builder().
                        chatId(message.getChatId().toString()).
                        text("Сейчас посчитаю" + " " + message.getText()).build());
            }
        }
    }
}
