package stepDefinitions;
import io.cucumber.java.pt.*;
import pages.*;

public class WebmotorsTestSteps {
	
	HomeWebmotorsPage homeWebmotors = new HomeWebmotorsPage();
	
	@Dado("que eu navego até a página Home do Webmotors")
	public void navegarAteSite(){
		homeWebmotors.navegaSite();
	}

}
