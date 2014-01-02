package EDM.edm.main;

import java.io.File;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import EDM.edm.main.client.ClientProxy;
import EDM.edm.main.lib.Library;

import com.google.common.eventbus.EventBus;

import net.minecraft.block.Block;
import static net.minecraft.block.Block.*;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.versioning.ArtifactVersion;
import cpw.mods.fml.common.versioning.VersionRange;

@Mod(modid = Library.modID, name= Library.Name, version="3.0.0", dependencies="required-after:Forge@[9.11.1.953,)")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class EDMCore extends DummyModContainer
{
	
	@Instance("EDMCore")
	public EDMCore instance;
	
	@SidedProxy(clientSide="EDM.edm.main.client.ClientProxy")
	public static ClientProxy proxy;
	
	@EventHandler
	public static void preload(FMLPreInitializationEvent event)
	{
	
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event)
	{
		proxy.Load();
	}
	
	@EventHandler
	public static void postload(FMLPostInitializationEvent event)
	{
		
		
	}

	@Override
	public String getModId() 
	{
		return Library.modid();
	}

	@Override
	public String getName() 
	{
		
		return Library.name();
	}

	@Override
	public String getVersion() 
	{
		return Library.version();
	}

	
}
