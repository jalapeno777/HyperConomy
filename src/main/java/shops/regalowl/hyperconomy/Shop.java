package regalowl.hyperconomy;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public interface Shop {
	
	
	public void setPoint1(String world, int x, int y, int z);
	public void setPoint2(String world, int x, int y, int z);
	public void setPoint1(Player player);
	public void setPoint2(Player player);

	public void setMessage1(String message);
	public void setMessage2(String message);
	public void setDefaultMessages();
	public void setWorld(String world);
	public void setName(String name);
	public void setEconomy(String economy);
	
	public boolean inShop(int x, int y, int z, String world);
	public boolean inShop(Player player);
	public void sendEntryMessage(Player player);
	
	public String getEconomy();
	public String getName();
	public String getDisplayName();
	
	public boolean has(String item);
	
	public void addAllObjects();
	public void removeAllObjects();
	public void addObjects(ArrayList<String> objects);
	public void removeObjects(ArrayList<String> objects);
	
	public int getP1x();
	public int getP1y();
	public int getP1z();
	public int getP2x();
	public int getP2y();
	public int getP2z();

}
