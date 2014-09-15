package com.github.tempest200903;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * @author tempest200903
 * 
 */
public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return TopPage.class;
	}

}
