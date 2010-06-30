package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.presentation.Layer;
import com.idega.presentation.web2.DynamicTree;

public class CurrentBalanceViewer extends TelecomBlock {

	@Override
	public void present(FacesContext context) {
		Layer container = new Layer();
		add(container);
		
		DynamicTree tree = new DynamicTree();
		container.add(tree);
	}	
}