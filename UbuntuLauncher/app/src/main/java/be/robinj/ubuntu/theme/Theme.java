package be.robinj.ubuntu.theme;

import android.content.Context;
import android.graphics.drawable.Drawable;

import be.robinj.ubuntu.R;

/**
 * Created by robin on 21/01/15.
 */
public abstract class Theme
{
	// Launcher //
	public int launcher_location;
	public int launcher_margin;
	public int launcher_background_dynamic;
	public int launcher_background;
	public int launcher_bfb_location;
	public int launcher_bfb_image;
	public int launcher_preferences_location;
	public int launcher_preferences_image;
	public int launcher_applauncher_backgroundcolour_dynamic;
	public int launcher_applauncher_backgroundcolour;
	public int launcher_applauncher_background;
	public int launcher_applauncher_gradient;
	public int launcher_applauncher_running;

	// Panel //
	public int panel_location;
	public int panel_height;
	public int panel_background;
	public int panel_background_dynamic_if_dash_opened;
	public int panel_bfb_location;
	public int panel_bfb_text;
	public int panel_bfb_text_colour;
	public int panel_close_location;
	public int panel_close_image;
	public int panel_preferences_location;
	public int panel_preferences_image;

	// Dash //
	public int dash_background_gradient;
	public int dash_background_dynamic;
	public int dash_background;
	public int dash_applauncher_text_colour;
	public int dash_applauncher_text_shadow_colour;
	public int dash_search_background;
	public int dash_search_text_colour;
}
