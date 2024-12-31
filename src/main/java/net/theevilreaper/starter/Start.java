package net.theevilreaper.starter;

import net.minestom.server.MinecraftServer;

/**
 * Main class which contains the logic to start the server.
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public class Start {

    private static final String HOST_KEY = "server.host";
    private static final String HOST_PORT = "server.port";

    /**
     * Starts the given server with the given host and port.
     *
     * @param args the arguments to start the server
     */
    public static void main(String[] args) {
        String host = System.getProperty(HOST_KEY, "localhost");
        int port = Integer.parseInt(System.getProperty(HOST_PORT, "25577"));
        MinecraftServer server = MinecraftServer.init();
        server.start(host, port);
    }
}
