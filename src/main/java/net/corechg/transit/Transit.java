package net.corechg.transit;

import net.corechg.transit.type.group.simple.SimpleGroups;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Transit.MODID, name = Transit.NAME, version = Transit.VERSION)
public class Transit {
	
	public static final String MODID = "transit-api";
    public static final String NAME = "TransitAPI";
    public static final String VERSION = "0.11.2-forge";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		SimpleGroups.init();
	}

}
