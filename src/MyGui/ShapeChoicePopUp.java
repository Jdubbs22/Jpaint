package MyGui;

import view.interfaces.IDialogChoice;

public class ShapeChoicePopUp implements IDialogChoice{  //need to make one of these for each pop up

	@Override
	public Object getCurrentSelection() {
		// TODO Auto-generated method stub
		System.out.println("test of getCurrentSelection()");
		return "current selection1";
	}

	@Override
	public Object[] getDialogOptions() {
		// TODO Auto-generated method stub
		System.out.println("test of getDialogOptions()");
		String array[] = {"dialog ","options2"};
		return array;
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		System.out.println("test of getDialogText()");
		//return new Rectangle(), new Triangle(), new Elipse();
		return "options";
	}

	@Override
	public String getDialogTitle() {
		// TODO Auto-generated method stub
		System.out.println("test of getDialogTitle()");
		return "Choose a Shape";
	}

}
