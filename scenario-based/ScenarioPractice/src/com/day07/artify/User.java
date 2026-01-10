package com.day07.artify;

public class User implements IPurchasable {
	String name;
	double walletBalance;
	Artwork aa;
	String product;
	int choice;
	User(String name , Double walletBalance, Artwork aa, String product,int choice){
		this.name = name;
		this.walletBalance = walletBalance;
		this.aa = aa;
		this.product = product;
		this.choice = choice;
	}
    public void purchase() {
    	if(choice == 1) {
    		for(DigitalArt ad:aa.l1) {
    			if(ad.title.equals(product)) {
    				walletBalance = walletBalance - ad.price;
    				System.out.println("your current balance is: "+walletBalance);
    			}
    		}
    	} else {
    		for(PrintArt pd: aa.l2) {
    			if(pd.title.equals(product)) {
    				walletBalance = walletBalance - pd.price;
    				System.out.println("your current balance is: "+walletBalance);
    			}
    		}
    	}
    }
    public boolean license() {
    	if(choice == 1) {
    		for(DigitalArt ad:aa.l1) {
    			if(ad.title.equals(product)) {
    				if(ad.licenseType.equals("Personal")) {
    					return false;
    				}else {
    					return true;
    				}
    			} else {
    				System.out.println("we do not have this product");
    				break;
   
    			}
    		}
    	}
    	else {
    		for(PrintArt pd:aa.l2) {
    			if(pd.title.equals(product)) {
    				if(pd.licenseType.equals("Personal")) {
    					return false;
    				}
    				else {
    					return true;
    				}
    			} 
    				else {
    				System.out.println("we do not have this product");
                    break;
    			}
    		}
    	}
    	return false;
    }
    

}
