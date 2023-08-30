package de.merkeg.poker;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Settings s = Strategy.setup();

        if(args.length == 3) {
            s = Settings.builder()
                    .host(args[0])
                    .gameId(Long.parseLong(args[1]))
                    .teamName(args[2])
                    .build();
        }

        WebSocketClient client = new WebSocketClient(s.getURI());
        client.connect();
    }
}