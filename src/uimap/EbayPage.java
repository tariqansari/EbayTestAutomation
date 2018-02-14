package uimap;

import org.openqa.selenium.By;

public class EbayPage {

	//LoginIn Screen
	public static final By username = By.id("com.ebay.mobile:id/edit_text_username");
	
	public static final By password = By.id("com.ebay.mobile:id/edit_text_password");
	public static final By signInBtn = By.id("com.ebay.mobile:id/button_sign_in");
	
	
	// No Thanks Page
	public static final By noThanks = By.id("com.ebay.mobile:id/button_google_deny");
	
	
	//Search Screen
	public static final By selectSearch = By.id("com.ebay.mobile:id/search_box");
	// Enter Julis Caeser as a product
	public static final By productName = By.id("com.ebay.mobile:id/search_src_text");
	
	// Click the option come after once user enter the product name
	
	public static final By searchProd = By.id("com.ebay.mobile:id/text");
	
	// select the first prod from the list view
	public static final By selectProdList = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout");
	
	
	//
	
	
	
	
}
