package MyGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestOfListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
for(int row =0; row<4;row++){
			
			for( int hashnum=0; hashnum<row; hashnum++){
			System.out.print("#");	
			}//end internal for
			System.out.println();
		}//end for
		
		for(int row=5; row>0;row--){
			
			for(int hashnum=0;hashnum<row;hashnum++){
	
			System.out.print("#");	
			
			}//end internal for
			System.out.println();
		
			
		}//end for
		
		
	}

}
