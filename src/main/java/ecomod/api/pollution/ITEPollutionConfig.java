package ecomod.api.pollution;

import javax.annotation.Nonnull;

import net.minecraft.util.ResourceLocation;

/**
 * Used to provide API access to TEPollutionConfig values. For semi-internal usage.
 * <br>
 * Use on *server* side
 * <br>
 * <strong>Do not implement!!!</strong>
 */
public interface ITEPollutionConfig {
	public boolean containsTile(@Nonnull ResourceLocation id);
	
	public PollutionData getTilePollution(@Nonnull ResourceLocation id);
	
	public boolean removeTilePollution(@Nonnull ResourceLocation id);
	
	public boolean addTilePollution(@Nonnull ResourceLocation id, @Nonnull PollutionData emission, boolean override);
	
	public String getVersion();
}
