package fr.mouarius.onn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import fr.mouarius.onn.lib.References;
import fr.mouarius.onn.proxies.CommonProxy;

/**
 * Om Nom Nom !
 * 
 * OmNomNom
 * 
 * @author mouarius
 * 
 * @license GNU Lesser General Public License v2
 *          (http://www.gnu.org/licenses/lgpl.html)
 * 
 * @copyright Copyright (C) 2013 Mouarius
 **/
@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class OmNomNom
{
	@SidedProxy(clientSide = References.PROXY_LOCATION + ".ClientProxy", serverSide = References.PROXY_LOCATION
			+ ".CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.initRenderers();
		proxy.initSounds();
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
	}

}
