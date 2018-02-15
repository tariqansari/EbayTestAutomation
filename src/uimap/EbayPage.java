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
	
	
	// click on Buy it now button
	public static final By buyItNowBtn = By.id("com.ebay.mobile:id/button_bin");
	
	// click to proceed to Pay
	public static final By proceedToPayBtn = By.id("proceedToPay");
	
	// Select the Payment Method"
	public static final By paymentMethod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[7]/android.view.View");
	
	// select Radio button
	public static final By selectPayTM = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[2]/android.widget.ListView/android.view.View[7]/android.view.View[4]/android.view.View[2]/android.widget.ListView/android.view.View[5]/android.widget.RadioButton");
	
	//Click Pay Now
	public static final By payNowBtn = By.id("btnPay");
	
	
	// Close button
	public static final By closeBtn = By.id("com.ebay.mobile:id/home");
	
	
	// Click LHN
	public static final By lhn = By.id("com.ebay.mobile:id/home");
	// //android.widget.ImageButton[@content-desc="Main navigation, open"]
	
	// user option
	public static final By clickUser = By.id("com.ebay.mobile:id/textview_sign_in_status");
	
	// signOut
	public static final By signOut = By.id("com.ebay.mobile:id/menuitem_sign_out");
	
	
}
