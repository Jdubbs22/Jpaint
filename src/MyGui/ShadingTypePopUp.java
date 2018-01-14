package MyGui;

import view.interfaces.IDialogChoice;

public class ShadingTypePopUp implements IDialogChoice{

	@Override
	public Object getCurrentSelection() {
		// TODO Auto-generated method stub
		return "test1";
	}

	@Override
	public Object[] getDialogOptions() {
		// TODO Auto-generated method stub
		String array3[] = {"dialog ","options2"};;
		return array3;
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		return "test2";
	}

	@Override
	public String getDialogTitle() {
		// TODO Auto-generated method stub
		return "test3";
	}

}//end class
