package MyGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.gui.Gui;
import view.interfaces.IDialogChoice;

public class dialoguePopUpLIstener implements ActionListener{ //Event listeners represent the interfaces responsible to handle events.
		public dialoguePopUpLIstener(Gui aGui, IDialogChoice dialogChoice) {
		super();
		this.aGui = aGui;
		this.dialogChoice = dialogChoice;
	}
		Gui aGui;  //ala myGuiWindow created in main
		IDialogChoice dialogChoice; //ala ShapeChoicePopUp class
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test of action event");
		
		aGui.getDialogResponse(dialogChoice); //brings up dialog text box
		
	}

	
	
}//end class
