package MyGui;

import view.interfaces.IDialogChoice;

public class PrimarycolorPopUp implements IDialogChoice {

	@Override
	public Object getCurrentSelection() {
		// TODO Auto-generated method stub
		System.out.println("test of getcurrent selection in primary color");
		return "current selection1";
	}

	@Override
	public Object[] getDialogOptions() {
		// TODO Auto-generated method stub
		String array1[] = {"Black","Blue"};;
		return array1;
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		return "Available Choices";
	}

	@Override
	public String getDialogTitle() {
		// TODO Auto-generated method stub
		return "Primary Color";
	}

}//end class
