package regalowl.hyperconomy;

import org.bukkit.command.CommandSender;

public class Setmedian {
	Setmedian(String args[], CommandSender sender, String playerecon) {
		HyperConomy hc = HyperConomy.hc;
		DataHandler sf = hc.getDataFunctions();
		InfoSignHandler isign = hc.getInfoSignHandler();
		LanguageFile L = hc.getLanguageFile();
		String name = "";
		try {
			if (args.length == 2) {
				name = sf.fixName(args[0]);
				int median = Integer.parseInt(args[1]);
				if (sf.itemTest(name)) {
					sf.getHyperObject(name, playerecon).setMedian(median);
					sender.sendMessage(L.f(L.get("MEDIAN_SET"), name));
					isign.updateSigns();
				} else {
					sender.sendMessage(L.get("INVALID_ITEM_NAME"));
				}
			} else if (args.length == 3) {
				String ench = args[2];
				if (ench.equalsIgnoreCase("e")) {
					name = args[0];
					int median = Integer.parseInt(args[1]);
					if (sf.enchantTest(name)) {
						sf.getHyperObject(name, playerecon).setMedian(median);
						sender.sendMessage(L.f(L.get("MEDIAN_SET"), name));
						isign.updateSigns();
					} else {
						sender.sendMessage(L.get("INVALID_ENCHANTMENT_NAME"));
					}
				} else {
					sender.sendMessage(L.get("SETMEDIAN_INVALID"));
				}
			} else {
				sender.sendMessage(L.get("SETMEDIAN_INVALID"));
			}
		} catch (Exception e) {
			sender.sendMessage(L.get("SETMEDIAN_INVALID"));
		}
	}
}
