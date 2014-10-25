package com.letum.legendarystuff.item;

import com.letum.legendarystuff.creativetab.CTLS;
import net.minecraft.potion.Potion;

public class ItemTit extends ItemLS {
    public ItemTit(){
        super();
        this.setUnlocalizedName("itemTit");
        this.setTextureName("itemTit");
        this.setPotionEffect(String.valueOf(Potion.moveSpeed));
        this.setCreativeTab(CTLS.CTLS);
        this.setFull3D();
    }
}
