package tic_tac_toe;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String pinax[]={"1","2","3","4","5","6","7","8","9"};

		String s1="X";
	    String s2="O";
	    String s3;
	    String s4;
	    int counter=1;
	    int counter2=1;
	    int counter3=1;
	    
	    drawFunction(pinax);

	    for (int j=0;j<4;j++){
	    	/*
	    	 * Player 'X' plays
	    	 */
	    	while (counter==1){
s3=JOptionPane.showInputDialog("Player 'X' Choose the position in which you want to insert X, "
 		+ "and × will be inserted"
 		+ " (from 1-9)");
int num=Integer.parseInt(s3);
num=num-1;

if (!pinax[num].equals(s1)&&!pinax[num].equals(s2)){
pinax[num]=s1;
break;
}

else
	{System.out.println("Wrong, occupied position, play again");
	counter=1;
	}
drawFunction(pinax);
	    	}
	    	drawFunction(pinax);


/*
 * Player 'O' plays
 */
	    	while (counter2==1){

s4=JOptionPane.showInputDialog("Player 'O' Choose the position in which you want to insert O, "
 		+ "and O will be inserted"
 		+ " (from 1-9)");
int num2=Integer.parseInt(s4);
num2=num2-1;

if (!pinax[num2].equals(s1)&&!pinax[num2].equals(s2)){
pinax[num2]=s2;
break;}

else
	{System.out.println("Wrong, occupied position, play again");
	counter2=1;
	}
drawFunction(pinax);
	    	}
	    	drawFunction(pinax);

	    }
	    
	    /*
	     * Player 'O' plays
	     */
	    while (counter3==1){
	    	s3=JOptionPane.showInputDialog("Player 'X' Choose the position in which you want to insert X, "
	    	 		+ "and × will be inserted"
	    	 		+ " (from 1-9)");
	    	int num=Integer.parseInt(s3);
	    	num=num-1;

	    	if (!pinax[num].equals(s1)&&!pinax[num].equals(s2)){
	    	pinax[num]=s1;
	    	break;
	    	}

	    	else
	    		{System.out.println("Wrong, occupied position, play again");
	    		counter3=1;
	    		}
	    	drawFunction(pinax);
	    		    	}
	    		    	drawFunction(pinax);
	    		    	JOptionPane.showMessageDialog(null, "Draw!");
	    		    	System.exit(0);
	    
	}

	
	
	
	
	
    public static void drawFunction(String[] pinakas){
    	for (int i=0;i<9;i++){ 
        	System.out.print(pinakas[i]+" ");
        	if (i==2||i==5)
        	System.out.print("\n");
        	}
    		System.out.print("\n");
    		System.out.print("\n");
    		String str1="X";
    		String str2="O";

    	    	if (str1.equals(pinakas[0])&&str1.equals(pinakas[1])&&str1.equals(pinakas[2])
    	    	  ||str1.equals(pinakas[3])&&str1.equals(pinakas[4])&&str1.equals(pinakas[5])
    	    	  ||str1.equals(pinakas[6])&&str1.equals(pinakas[7])&&str1.equals(pinakas[8])
    	    	  ||str1.equals(pinakas[0])&&str1.equals(pinakas[3])&&str1.equals(pinakas[6])
    	    	  ||str1.equals(pinakas[1])&&str1.equals(pinakas[4])&&str1.equals(pinakas[7])
    	    	  ||str1.equals(pinakas[2])&&str1.equals(pinakas[5])&&str1.equals(pinakas[8])
    	    	  ||str1.equals(pinakas[0])&&str1.equals(pinakas[4])&&str1.equals(pinakas[8])
    	    	  ||str1.equals(pinakas[2])&&str1.equals(pinakas[4])&&str1.equals(pinakas[6]))    
    	    	{
    		    JOptionPane.showMessageDialog(null, "Player 'X' wins!");

    	    	System.exit(0);}
    	    	else if (str2.equals(pinakas[0])&&str2.equals(pinakas[1])&&str2.equals(pinakas[2])
  	    	    	  ||str2.equals(pinakas[3])&&str2.equals(pinakas[4])&&str2.equals(pinakas[5])
	    	    	  ||str2.equals(pinakas[6])&&str2.equals(pinakas[7])&&str2.equals(pinakas[8])
	    	    	  ||str2.equals(pinakas[0])&&str2.equals(pinakas[3])&&str2.equals(pinakas[6])
	    	    	  ||str2.equals(pinakas[1])&&str2.equals(pinakas[4])&&str2.equals(pinakas[7])
	    	    	  ||str2.equals(pinakas[2])&&str2.equals(pinakas[5])&&str2.equals(pinakas[8])
	    	    	  ||str2.equals(pinakas[0])&&str2.equals(pinakas[4])&&str2.equals(pinakas[8])
	    	    	  ||str2.equals(pinakas[2])&&str2.equals(pinakas[4])&&str2.equals(pinakas[6]))
	    	    	{
	    		    JOptionPane.showMessageDialog(null, "Player 'O' wins!");
	    	    	System.exit(0);}
    }

}

