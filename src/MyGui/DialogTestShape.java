package MyGui;

import java.awt.Shape;

import view.interfaces.IDialogChoice;

public class DialogTestShape implements IDialogChoice<ShapeTest>{  //can also try Shape
	enum SHAPES{
		 ELLIPSE, RECTANGLE, TRIANGLE
	};
	@Override
	public ShapeTest getCurrentSelection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShapeTest[] getDialogOptions() {
		// TODO Auto-generated method stub
		String array[]= {"test","2"};
		return null;
	}

	@Override
	public String getDialogText() {
		// TODO Auto-generated method stub
		return "Test1";
	}

	@Override
	public String getDialogTitle() {
		// TODO Auto-generated method stub
		return "test2";
	}

}
