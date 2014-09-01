package me.fdd2001.mod.Redstoner;


// This Dosn't require to be next to water to grow

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Bamboo extends Block
{
	protected Bamboo(int i, int j)
	{
		super(Material.plants);
		//blockIndexInTexture = j;
		float F = 0.300F;
		setBlockBounds(0.5F - F, 0.0F, 0.5F - F, 0.5F + F, 1.0F, 0.5F + F);
		this.setTickRandomly(true);
	}
	
	
	
	
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i,
			int j, int k) {
		return null;
	}
	
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	public int getRenderType()
	{
		return 1;
	}
}
