package com.idega.telecom.presentation;

import com.idega.presentation.IWContext;
import com.idega.presentation.Layer;
import com.idega.presentation.web2.DynamicTree;

public class CurrentBalanceViewer extends TelecomBlock {

	@Override
	public void main(IWContext iwc) {
		try {
			super.main(iwc);
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		Layer container = new Layer();
		add(container);
		
		DynamicTree tree = new DynamicTree();
		container.add(tree);
	}
	
}
