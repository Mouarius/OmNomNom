package fr.mouarius.onn.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.mouarius.onn.proxies.ClientProxy;

/**
 * Om Nom Nom !
 * 
 * RenderCustomBlocks
 * 
 * @author mouarius
 * 
 * @license GNU Lesser General Public License v2
 *          (http://www.gnu.org/licenses/lgpl.html)
 * 
 * @copyright Copyright (C) 2013 Mouarius
 **/
public class RenderCustomBlocks implements ISimpleBlockRenderingHandler
{
	public void renderInventoryBlock(Block block, int meta, int modelID,
			RenderBlocks renderer)
	{

	}

	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer)
	{
		return false;
	}

	public boolean shouldRender3DInInventory()
	{
		return true;
	}

	public int getRenderId()
	{
		return 0;
	}

	public boolean renderHotPlate(Block block, int x, int y, int z, RenderBlocks renderer)
	{
		float f = 0.0625F;
	    float i = 1.0E-04F;
	    int l = renderer.blockAccess.getBlockMetadata(x, y, z);

	    renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 3f, 1.0F);
	    renderer.renderStandardBlock(block, x, y, z);

	    
	    return true;
	}
	 public void renderHotPlateInInv(Block block, int meta, RenderBlocks renderer)
	  {
	    float f = 0.0625F;

	    renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 3f, 1.0F);

	      Tessellator tessellator = Tessellator.instance;
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(0.0F, -1.0F, 0.0F);
	      renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 0, meta));
	      tessellator.draw();
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(0.0F, 1.0F, 0.0F);
	      renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 1, meta));
	      tessellator.draw();
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(0.0F, 0.0F, -1.0F);
	      renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 2, meta));
	      tessellator.draw();
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(0.0F, 0.0F, 1.0F);
	      renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 3, meta));
	      tessellator.draw();
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(-1.0F, 0.0F, 0.0F);
	      renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 4, meta));
	      tessellator.draw();
	      tessellator.startDrawingQuads();
	      tessellator.setNormal(1.0F, 0.0F, 0.0F);
	      renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, 
	        renderer.getBlockIconFromSideAndMetadata(block, 5, meta));
	      tessellator.draw();
	    }
	  
}