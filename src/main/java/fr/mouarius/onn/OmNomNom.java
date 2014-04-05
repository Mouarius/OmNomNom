package fr.mouarius.onn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.mouarius.onn.blocks.Blocks;
import fr.mouarius.onn.lib.References;
import fr.mouarius.onn.proxies.CommonProxy;
@Mod(modid = References.MODID, name = References.MODNAME, version = References.MODVERSION)

public class OmNomNom {
	@SidedProxy(clientSide = References.PROXYLOCATION + ".ClientProxy", serverSide = References.PROXYLOCATION + ".CommonProxy")
	public static CommonProxy proxy;

		@Mod.EventHandler
	    public static void preInit(FMLPreInitializationEvent event)
	    {
			Blocks.init();
	    }

	    @Mod.EventHandler
	    public static void init(FMLInitializationEvent event)
	    {

	    }

	    @Mod.EventHandler
	    public static void postInit(FMLPostInitializationEvent event)
	    {

	    }

}
