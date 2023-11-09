package de.merkeg.poker;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Settings s = Strategy.setup();

        if(args.length == 3) {
            s = Settings.builder()
                    .host(args[0])
                    .gameId(Long.parseLong(args[1]))
                    .teamName(args[2])
                    .build();
        }

        WebSocketClient client = new WebSocketClient(s.getURI());
        log.info("Connecting via WebSocket on {}", s.getURI());
        client.connect();
    }
}