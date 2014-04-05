package fr.mouarius.onn.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import fr.mouarius.onn.lib.Strings;

public class TestBlock extends BlockONN{

	protected TestBlock() {
		this.setBlockName(Strings.testBlockName);
        this.setHardness(1f);
        this.setResistance(3f);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(Block.soundTypeAnvil);
        Blocks.register(this);
	}

}
