package fr.mouarius.onn.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks {
	public static Block testBlock;
	
	public static void init(){
		testBlock = new TestBlock();
	}
	public static void register(BlockONN block)
	{
	    GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
	}
}
