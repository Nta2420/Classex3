import javax.swing.JOptionPane;

public class Classex3 {

	public static void main(String[] args) {
		String strNumPeople = " ";
		String strNumPlayers = " ";
		double dblNumPeople, dblNumPlayers,dblgroupSize,dblexecuteteamSize;
		strNumPeople = JOptionPane.showInputDialog("Enter Num People");
		
		dblNumPeople = Double.parseDouble(strNumPeople);
		if (dblNumPeople >= 10){
			dblgroupSize = dblNumPeople/2;
		}else if ((dblNumPeople<=10)&&(dblNumPeople>=3) ){
			dblgroupSize = dblNumPeople/3;
		}else {
			dblgroupSize = 3;
		}
		JOptionPane.showMessageDialog(null, "groupsize is " + dblgroupSize);	
		strNumPlayers = JOptionPane.showInputDialog("Enter Num Players");
		dblNumPlayers = Double.parseDouble(strNumPlayers);
		if ((dblNumPlayers>=11)&&(dblNumPlayers<=55)){
			dblexecuteteamSize = dblNumPlayers/11;
		} else {
			dblexecuteteamSize = 1;
		}
		JOptionPane.showMessageDialog(null, "groupsize is " + dblexecuteteamSize);
	}
}	
	


