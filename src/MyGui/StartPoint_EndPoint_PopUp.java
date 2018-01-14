package MyGui;

import view.interfaces.IDialogChoice;

public class StartPoint_EndPoint_PopUp implements IDialogChoice{

	@Override
	public Object getCurrentSelection() {
		// TODO Auto-generated method stub
		return "test1";
	}

	@Override
	public Object[] getDialogOptions() {
		// TODO Auto-generated method stub
		String array4[] = {"dialog ","options2"};;
		return array4;
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
