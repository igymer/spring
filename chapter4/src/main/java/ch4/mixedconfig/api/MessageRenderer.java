package ch4.mixedconfig.api;

public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);
    void render();
}
