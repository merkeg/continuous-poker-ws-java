package de.merkeg.poker;


import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.net.URI;

@Builder
@RequiredArgsConstructor
public class Settings {
    private final String host;
    private final long gameId;
    private final String teamName;

    @SneakyThrows
    public URI getURI() {
        return new URI("ws://"+host+"/games/"+gameId+"/websocket/"+teamName);
    }
}
