package MyGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.gui.Gui;
import view.interfaces.IDialogChoice;

public class dialoguePopUpLIstener implements ActionListener{
		public dialoguePopUpLIstener(Gui aGui, IDialogChoice dialogChoice) {
		super();
		this.aGui = aGui;
		this.dialogChoice = dialogChoice;
	}
		Gui aGui;
		IDialogChoice dialogChoice;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test of action event");
		
		aGui.getDialogResponse(dialogChoice); //brings up dialog text box
		
	}

	
	
}//end class
