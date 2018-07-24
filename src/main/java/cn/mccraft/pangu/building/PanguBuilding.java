package cn.mccraft.pangu.building;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = PanguBuilding.ID,
        name = PanguBuilding.NAME,
        version = PanguBuilding.VERSION,
        dependencies = "required:pangu@[1.0.3,)",
        acceptedMinecraftVersions = "[1.12.2,1.13)"
)
public class PanguBuilding {
    public static final String ID = "pangubuilding";
    public static final String NAME = "Pangu Building";
    public static final String VERSION = "@MOD_VERSION@";

    private static final Logger logger = LogManager.getLogger(NAME);

    public static Logger getLogger() {
        return logger;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) { }
}
