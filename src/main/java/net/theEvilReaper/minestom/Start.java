package net.theEvilReaper.minestom;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extras.bungee.BungeeCordProxy;

/**
 * @author theEvilReaper
 * @version 1.0.0
 * @since 1.0.0
 **/
public class Start {

    public static void main(String[] args) {
        var server = MinecraftServer.init();
        BungeeCordProxy.enable();
        server.start("localhost", 25577);
    }
}
