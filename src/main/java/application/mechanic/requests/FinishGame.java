package application.mechanic.requests;

import application.mechanic.Config;
import application.websocket.Message;
import org.jetbrains.annotations.NotNull;

public class FinishGame extends Message {
    @NotNull
    private String type;
    private boolean result;

    public FinishGame(boolean result) {
        this.result = result;
        this.type = Config.FINAL_STEP;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @NotNull
    public String getType() {
        return type;
    }

    public void setType(@NotNull String type) {
        this.type = type;
    }

    public boolean isResult() {
        return result;
    }
}
