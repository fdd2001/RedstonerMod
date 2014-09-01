package me.fdd2001.mod.Redstoner;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = RedstonerMod.MODID, version = RedstonerMod.VERSION)
public class RedstonerMod
{
    public static final String MODID = "redstoner";
    public static final String VERSION = "1.0";
    
    public static Block bamboo;
    
    
    public Object instance;
    public static int mobid = 0;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(Mothership_Q.EntityMothership_Q.class, "Mothership_Q", entityID);
		//
		EntityRegistry.registerModEntity(Mothership_Q.EntityMothership_Q.class, "Mothership_Q", mobid, this, 32, 1, true);
		Mothership_Q.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		
		int entityID2 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Doom_Blah.EntityDoom_Blah.class, "Doom_Blah", entityID2);
		//
		EntityRegistry.registerModEntity(Doom_Blah.EntityDoom_Blah.class, "Doom_Blah", entityID2, this, 32, 1, true);
		Doom_Blah.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID2), new EntityList.EntityEggInfo(entityID2, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		
		int entityID3 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(ipfreely644.Entityipfreely644.class, "ipfreely644", entityID3);
		//
		EntityRegistry.registerModEntity(ipfreely644.Entityipfreely644.class, "ipfreely644", entityID3, this, 32, 1, true);
		ipfreely644.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID3), new EntityList.EntityEggInfo(entityID3, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID4 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Nightshade32.EntityNightshade32.class, "Nightshade32", entityID4);
		//
		EntityRegistry.registerModEntity(Nightshade32.EntityNightshade32.class, "Nightshade32", entityID4, this, 32, 1, true);
		Nightshade32.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID4), new EntityList.EntityEggInfo(entityID4, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID5 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Eniallator.EntityEniallator.class, "Eniallator", entityID5);
		//
		EntityRegistry.registerModEntity(Eniallator.EntityEniallator.class, "Eniallator", entityID5, this, 32, 1, true);
		Eniallator.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID5), new EntityList.EntityEggInfo(entityID5, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID6 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(HiddenSentinels.EntityHiddenSentinels.class, "HiddenSentinels", entityID6);
		//
		EntityRegistry.registerModEntity(HiddenSentinels.EntityHiddenSentinels.class, "HiddenSentinels", entityID6, this, 32, 1, true);
		HiddenSentinels.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID6), new EntityList.EntityEggInfo(entityID6, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID7 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Gapbrick.EntityGapbrick.class, "Gapbrick", entityID7);
		//
		EntityRegistry.registerModEntity(Gapbrick.EntityGapbrick.class, "Gapbrick", entityID7, this, 32, 1, true);
		Gapbrick.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID7), new EntityList.EntityEggInfo(entityID7, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID8 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Pigglypops.EntityPigglypops.class, "Pigglypops", entityID8);
		//
		EntityRegistry.registerModEntity(Pigglypops.EntityPigglypops.class, "Pigglypops", entityID8, this, 32, 1, true);
		Pigglypops.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID8), new EntityList.EntityEggInfo(entityID8, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID9 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Dico200.EntityDico.class, "Dico200", entityID9);
		//
		EntityRegistry.registerModEntity(Dico200.EntityDico.class, "Dico200", entityID9, this, 32, 1, true);
		Dico200.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID9), new EntityList.EntityEggInfo(entityID9, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID10 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(redstone_sheep.EntityRSSheep.class, "redstone_sheep", entityID10);
		//
		EntityRegistry.registerModEntity(redstone_sheep.EntityRSSheep.class, "redstone_sheep", entityID10, this, 32, 1, true);
		redstone_sheep.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID10), new EntityList.EntityEggInfo(entityID10, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID11 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(gundershot.Entitygundershot.class, "gundershot", entityID11);
		//
		EntityRegistry.registerModEntity(gundershot.Entitygundershot.class, "gundershot", entityID11, this, 32, 1, true);
		gundershot.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID11), new EntityList.EntityEggInfo(entityID11, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID12 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Asecta.Entityasecta.class, "Asecta", entityID12);
		//
		EntityRegistry.registerModEntity(Asecta.Entityasecta.class, "Asecta", entityID12, this, 32, 1, true);
		Asecta.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID12), new EntityList.EntityEggInfo(entityID12, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID13 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(TraksAG.EntityTraks.class, "TraksAG", entityID13);
		//
		EntityRegistry.registerModEntity(TraksAG.EntityTraks.class, "TraksAG", entityID13, this, 32, 1, true);
		TraksAG.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID13), new EntityList.EntityEggInfo(entityID13, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID14 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Misa.EntityMisa.class, "MisaXage", entityID14);
		//
		EntityRegistry.registerModEntity(Misa.EntityMisa.class, "MisaXage", entityID14, this, 32, 1, true);
		Misa.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID14), new EntityList.EntityEggInfo(entityID14, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID15 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(yop.EntityYop.class, "yop_tropix", entityID15);
		//
		EntityRegistry.registerModEntity(yop.EntityYop.class, "yop_tropix", entityID15, this, 32, 1, true);
		yop.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID15), new EntityList.EntityEggInfo(entityID15, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID16 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(KP.EntityKP.class, "KPkiller1671", entityID16);
		//
		EntityRegistry.registerModEntity(KP.EntityKP.class, "KPkiller1671", entityID16, this, 32, 1, true);
		KP.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID16), new EntityList.EntityEggInfo(entityID16, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID17 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(PanFritz.EntityPanFritz.class, "PanFritz", entityID17);
		//
		EntityRegistry.registerModEntity(PanFritz.EntityPanFritz.class, "PanFritz", entityID17, this, 32, 1, true);
		PanFritz.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID17), new EntityList.EntityEggInfo(entityID17, (255 << 16) + (255 << 8) + 51, (255 << 16) + (0 << 8) + 0));
		
		int entityID18 = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(Panda.Entitypanda.class, "panda", entityID18);
		//
		EntityRegistry.registerModEntity(Panda.Entitypanda.class, "panda", entityID18, this, 32, 1, true);
		Panda.registerRenderers();
		EntityList.entityEggs.put(Integer.valueOf(entityID18), new EntityList.EntityEggInfo(entityID18, (255 << 16) + (255 << 8) + 255, (0 << 16) + (0 << 8) + 0));
		
		
		bamboo = new Bamboo(10,5).setCreativeTab(CreativeTabs.tabDecorations).setBlockTextureName(MODID + ":bamboo").setBlockName("bamboo");
		//GameRegistry.registerBlock(bamboo, "bamboo");
		
		
		
		LanguageRegistry.instance().addStringLocalization("entity.Mothership_Q.name", "Mothership_Q");
		LanguageRegistry.instance().addStringLocalization("entity.Doom_Blah.name", "Doom_Blah");
		LanguageRegistry.instance().addStringLocalization("entity.ipfreely644.name", "ipfreely644");
		LanguageRegistry.instance().addStringLocalization("entity.Nightshade32.name", "Nightshade32");
		LanguageRegistry.instance().addStringLocalization("entity.Eniallator.name", "Eniallator");
		LanguageRegistry.instance().addStringLocalization("entity.HiddenSentinels.name", "HiddenSentinels");
		LanguageRegistry.instance().addStringLocalization("entity.Gapbrick.name", "Gapbrick");
		LanguageRegistry.instance().addStringLocalization("entity.Pigglypops.name", "Pigglypops");
		LanguageRegistry.instance().addStringLocalization("entity.Dico200.name", "Dico200");
		LanguageRegistry.instance().addStringLocalization("entity.redstone_sheep.name", "redstone_sheep");
		LanguageRegistry.instance().addStringLocalization("entity.gundershot.name", "gundershot");
		LanguageRegistry.instance().addStringLocalization("entity.Asecta.name", "Asecta");
		LanguageRegistry.instance().addStringLocalization("entity.TraksAG.name", "TraksAG");
		LanguageRegistry.instance().addStringLocalization("entity.MisaXage.name", "MisaXage");
		LanguageRegistry.instance().addStringLocalization("entity.yop_tropix.name", "yop_tropix");
		LanguageRegistry.instance().addStringLocalization("entity.KPkiller1671.name", "KPkiller1671");
		LanguageRegistry.instance().addStringLocalization("entity.PanFritz.name", "PanFritz");
		LanguageRegistry.instance().addStringLocalization("entity.panda.name", "Panda");
		
		//LanguageRegistry.addName(bamboo, "Bamboo");
    }
    /*public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    	Minecraft mc = Minecraft.getMinecraft();
    	GameSettings settings = mc.gameSettings;

    	if (par3Entity instanceof EntityPlayer) {
    		EntityPlayer player = (EntityPlayer) par3Entity;
    		
    		if (settings.keyBindUseItem.isPressed()) {
    			if(mc.objectMouseOver.entityHit != null){
    			    if(mc.objectMouseOver.entityHit instanceof Misa.EntityMisa){
    			        player.addChatComponentMessage(new ChatComponentText("♫ ♪ ♫ Maybe Black Misa. That Was a Joke. Haha. Fatman Chance. Eni way this cake is great. ♪♫"));
    			    }
    			}
    		}
    	}
    }*/
}
