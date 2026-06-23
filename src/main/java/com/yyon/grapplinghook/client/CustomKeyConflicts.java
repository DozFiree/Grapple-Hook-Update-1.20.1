package com.yyon.grapplinghook.client;

import net.minecraftforge.client.settings.IKeyConflictContext;
import net.minecraftforge.client.settings.KeyConflictContext;

public enum CustomKeyConflicts implements IKeyConflictContext {
	INGAME_NO_CONFLICT {
		@Override
		public boolean isActive() {
			return true;
		}

		@Override
		public boolean conflicts(IKeyConflictContext other) {
			return other == KeyConflictContext.IN_GAME || other == this;
		}
	}
}
