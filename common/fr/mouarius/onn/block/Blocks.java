package fr.mouarius.onn.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Om Nom Nom !
 * 
 * Blocks
 * 
 * @author mouarius
 * 
 * @license GNU Lesser General Public License v2
 *          (http://www.gnu.org/licenses/lgpl.html)
 * 
 * @copyright Copyright (C) 2013 Mouarius
 **/
public class Blocks
{

	public static void init()
	{

	}

	public static void addName()
	{

	}

	private static void addBlockName(Block block, Object metadata, String name)
	{
		String meta = "";
		if (metadata != null)
			meta = "." + String.valueOf(meta);
		LanguageRegistry.instance().addStringLocalization(
				block.getUnlocalizedName() + meta + ".name", name);
	}
}
