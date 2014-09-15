package com.github.tempest200903;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * @author tempest200903
 * 
 */
public class TopPage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TopPage() {
		add(new Label("projectListSize", "hello toppage"));
	}

}
