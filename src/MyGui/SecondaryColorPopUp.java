package MyGui;

import view.interfaces.IDialogChoice;

public class SecondaryColorPopUp implements IDialogChoice{

	@Override
	public Object getCurrentSelection() {
		// TODO Auto-generated method stub
		return "test1";
	}

	@Override
	public Object[] getDialogOptions() {
		// TODO Auto-generated method stub
		String array2[] = {"Red","Green"};
		return array2;
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		return "Available Colors";
	}

	@Override
	public String getDialogTitle() {
		// TODO Auto-generated method stub
		return "Secondary color";
	}

}
