package de.merkeg.poker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.merkeg.poker.model.Table;
import lombok.extern.slf4j.Slf4j;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

@Slf4j
public class WebSocketClient extends org.java_websocket.client.WebSocketClient {

    private final ObjectMapper mapper = new ObjectMapper();
    private final Strategy strategy = new Strategy();

    public WebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("Connection opened");

    }

    @Override
    public void onMessage(String s) {
        int bet = 0;
        try {
            Table table = mapper.readValue(s, Table.class);
            log.info("Got current Table: " + table.toString());
            bet = strategy.decide(table);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        log.info("Given Bet is: {}", bet);
        log.debug("Sending Bet to server");
        this.send(String.valueOf(bet));
        log.debug("Bet sent");

    }

    @Override
    public void onClose(int i, String s, boolean b) {
        log.info("Connection was closed");
    }

    @Override
    public void onError(Exception e) {
        log.error("Error while communicating with server ", e);
    }
}
