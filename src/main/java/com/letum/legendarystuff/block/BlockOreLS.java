package com.letum.legendarystuff.block;

import com.letum.legendarystuff.creativetab.CTLS;
import com.letum.legendarystuff.init.ModBlocks;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockOreLS extends BlockOre {
    public BlockOreLS(){
        super();
        this.setCreativeTab(CTLS.CTLS);
    }
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;
             if (this == ModBlocks.oreRuby)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            return j1;
        }
        return 0;
    }
}
