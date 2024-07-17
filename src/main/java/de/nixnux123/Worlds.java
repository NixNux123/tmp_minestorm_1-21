package de.nixnux123;

import net.minestom.server.MinecraftServer;
import net.minestom.server.instance.InstanceContainer;
import net.minestom.server.instance.anvil.AnvilLoader;

public class Worlds{

    private static Worlds worldManager;
    public static Worlds getInstance() {
        if (worldManager == null) {
            worldManager = new Worlds();
        }
        return worldManager;
    }

    public InstanceContainer loadWorld(String loadPath) {
        InstanceContainer instanceContainer = MinecraftServer.getInstanceManager().createInstanceContainer();
        instanceContainer.setChunkLoader(new AnvilLoader(loadPath));
        return instanceContainer;
    }
}
