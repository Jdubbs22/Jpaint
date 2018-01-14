package MainPack;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MyGui.PrimarycolorPopUp;
import MyGui.SecondaryColorPopUp;
import MyGui.ShadingTypePopUp;
import MyGui.ShapeChoicePopUp;
import MyGui.dialoguePopUpLIstener;
import view.EventName;
import view.gui.Gui;
import view.gui.GuiWindow;
import view.gui.PaintCanvas;
import view.interfaces.IGuiWindow;

public class MainTest {
  
	public static void main(String[] args) {
		PaintCanvas testPaintCanv = new PaintCanvas();  //the whitespace
		GuiWindow testGuiWind = new GuiWindow(testPaintCanv);  //the code for the buttons
		//EventName eventNameShape = new EventName();
		Gui myGuiWindow = new Gui(testGuiWind);
		JButton ShapeButton = testGuiWind.getButton(EventName.CHOOSE_SHAPE);  //JButton is java code that takes the enum eventname
																			//and adds the shapes button
		
		JButton PrimaryColorButton = testGuiWind.getButton(EventName.CHOOSE_PRIMARY_COLOR); 
		JButton SecondaryColorButton = testGuiWind.getButton(EventName.CHOOSE_SECONDARY_COLOR);
		JButton ShadingTypeButton = testGuiWind.getButton(EventName.CHOOSE_SHADING_TYPE);
		JButton Start_End_Button = testGuiWind.getButton(EventName.CHOOSE_START_POINT_ENDPOINT_MODE);
		
		
		ShapeButton.addActionListener(new dialoguePopUpLIstener(myGuiWindow, new ShapeChoicePopUp()));  //also java, anonomous class that waits for the function to be called
		//end ShapeButton.addActionListener(new ActionListener()
		
		PrimaryColorButton.addActionListener(new dialoguePopUpLIstener(myGuiWindow, new PrimarycolorPopUp()));
		SecondaryColorButton.addActionListener(new dialoguePopUpLIstener(myGuiWindow, new SecondaryColorPopUp()));
		ShadingTypeButton.addActionListener(new dialoguePopUpLIstener(myGuiWindow, new ShadingTypePopUp()));
		Start_End_Button.addActionListener(new dialoguePopUpLIstener(myGuiWindow, new ShadingTypePopUp()));
		
	}//end main

}//end maintest
