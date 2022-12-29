
public class PassParameters {
	static String theitem = "bmw";

	static public void make_the_item_name_in_upper() {
		theitem = theitem.toUpperCase();

		theitem = theitem + " wallpaper";

		theitem = theitem.replace(" wallpaper", " wallpaper OR background images");
	}
}