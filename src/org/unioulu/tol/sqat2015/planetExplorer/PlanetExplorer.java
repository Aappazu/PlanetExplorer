package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:
public class PlanetExplorer {
	
	private String[][] grid;
	private int explorerXCoord;
	private int explorerYCoord;
	private String explorerFacing;
	
	public PlanetExplorer(int x, int y){

		grid = new String[x][y];
		
	}
	
	public void setLocation(int xCoord, int yCoord, String face){
		explorerXCoord = xCoord;
		explorerYCoord = yCoord;
		explorerFacing = face;
	}
	
	public String getCurrentLocation(){
		return "(" + explorerXCoord + "," + explorerYCoord + "," + explorerFacing + ")";
	}
	
	public String land(PlanetExplorer pExp){
		String flightRoute = "";
		
		if(explorerFacing == "N"){
			pExp.turnLeft();
			flightRoute = flightRoute + "l";
		}
		else if(explorerFacing == "E"){
			pExp.turnLeft();
			pExp.turnLeft();
			flightRoute = flightRoute + "l";
			flightRoute = flightRoute + "l";
		}
		else if(explorerFacing == "S"){
			pExp.turnRight();
			flightRoute = flightRoute + "r";
		}
		
		while(explorerXCoord > 0){
			
			flightRoute = flightRoute + "f";
			
			explorerXCoord--;
		}
		
		pExp.turnRight(); //Turn right to go up
		flightRoute = flightRoute + "r";
		
		while(explorerYCoord > 0){
			
			flightRoute = flightRoute + "f";
			
			explorerYCoord--;
		}
		
		return "(" + explorerXCoord + "," + explorerYCoord + "," + explorerFacing + ")";
		
	}
	
	public void turnLeft(){
		if(explorerFacing == "N"){
			explorerFacing = "W";
		}
		else if(explorerFacing == "E"){
			explorerFacing = "N";
		}
		else if(explorerFacing == "S"){
			explorerFacing = "E";
		}
		else{
			explorerFacing = "S";
		}
	}
	
	public void turnRight(){
		if(explorerFacing == "N"){
			explorerFacing = "E";
		}
		else if(explorerFacing == "E"){
			explorerFacing = "S";
		}
		else if(explorerFacing == "S"){
			explorerFacing = "W";
		}
		else{
			explorerFacing = "N";
		}
	}
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
}
