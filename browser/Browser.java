package day2.homeassgn.browser;

public class Browser {

    public String launchBrowser(String browserName) {
    	
        System.out.println("Browser launched successfully: " + browserName);
        
        return browserName;
    }
    public void loadUrl() {
    	
        System.out.println("Application URL loaded successfully");
        
    }
    public static void main(String[] args) {
    	

        Browser myBrowser = new Browser();
        
        String launchedBrowser = myBrowser.launchBrowser("Chrome");
        
        System.out.println("Launched: " + launchedBrowser);
        
        myBrowser.loadUrl();
    }
}

