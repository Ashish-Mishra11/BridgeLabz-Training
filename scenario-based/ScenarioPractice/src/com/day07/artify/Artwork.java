package com.day07.artify;
import java.util.List;
import java.util.ArrayList;

public class Artwork {
	String title;
	String artist;
	double price;
	protected String licenseType;
    List<DigitalArt> l1;
    List<PrintArt> l2;
    Artwork(){
    	l1 = new ArrayList<>();
    	l2 = new ArrayList<>();
    }
}

