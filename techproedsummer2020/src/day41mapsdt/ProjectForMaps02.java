package day41mapsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProjectForMaps02 {

	/*
	  1) Create a list for color codes
	  2) Create a list for color names
	  3) Match the color codes with color names
	  4) Print code and colors like lightsalmon = rgb(255,160,122)
	  Note : work with 7 colors
	*/
	public static void main(String[] args) {
		
		List<String> codes = new ArrayList<>();
		codes.add("rgb(0,0,0)");
		codes.add("rgb(0,128,0)");
		codes.add("rgb(0,0,128)");
		codes.add("rgb(128,128,128)");
		codes.add("rgb(128,0,0)");
		codes.add("rgb(128,0,128)");
		codes.add("rgb(25,25,112)");
		
		List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Greenk");
        colors.add("Navy");
        colors.add("Gray");
        colors.add("Maroon");
        colors.add("Purple");
        colors.add("midnight blue");
        
        Map<String, String> colorsCodes = new TreeMap<>();
        //You have to use loops
        colorsCodes.put(colors.get(0), codes.get(0));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(1), codes.get(1));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(2), codes.get(2));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(3), codes.get(3));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(4), codes.get(4));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(5), codes.get(5));
        System.out.println(colorsCodes);
        colorsCodes.put(colors.get(6), codes.get(6));
        System.out.println(colorsCodes);
        
        


        
	}

}
