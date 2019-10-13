package com.untamedears.JukeAlert.model.actions;

import java.util.UUID;

import org.bukkit.Location;

import com.untamedears.JukeAlert.model.Snitch;
import com.untamedears.JukeAlert.model.actions.abstr.LoggableAction;

@FunctionalInterface
public interface LoggedActionProvider {
	
	public LoggableAction get(Snitch snitch, UUID player, Location location, long time, String victim);

}
