package Week6;




public class PlayersLinkedList {
	PlayerNode head;
	
	/* 
	 * Creating append Method 
	 * Insert node in our linkedlist
	 */
	
	public void append (int id,String firstName,String lastName,String playerName,String playerType,double lifePoints,int totalScore)
	  {
	    if (head == null)
	    {
	      head = new PlayerNode (id,firstName,lastName,playerName,playerType,lifePoints,totalScore);
	      return;
	    }
	    PlayerNode current = head;
	    
	    while (current.next != null)
	    {
	      current = current.next;
	    }
	    current.next = new PlayerNode(id,firstName,lastName,playerName,playerType,lifePoints,totalScore);
	  }
	
	
	/*
	 * Deletes a node based on a playerID provided by the user
	 */
	public void delete (int playerID) {
		PlayerNode current = head;
		int index = 0;
		int indexOfNode = 0;
        

		while (current.next != null) {
			index++;
			current = current.next;
			if (current.id == playerID) {
				indexOfNode = index;
			}
		}
		

		if (indexOfNode == 0) {
			head = head.next;
			return;
		}
		PlayerNode n = head;
		PlayerNode n1 = null;
		for (int i = 0; i<indexOfNode-1; i++) {
			n = n.next;
		}
		n1 = n.next;
		
		n.next = n1.next;
		    	
	}
	
	/*
	 * Finding total number of nodes
	 */
	public int length() {
		PlayerNode current = head;
		int count = 1;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		return count;
		
	}
	
	
	/*
	 * This method adds nodes in the beginning of Linkedlist
	 */
	public void prepend(int id,String firstName,String lastName,String playerName,String playerType,double lifePoints,int totalScore)
	{
		PlayerNode node = new PlayerNode(id,firstName,lastName,playerName,playerType,lifePoints,totalScore);

			node.next = head;
			head = node;	
	}
	
	
	/*
	 * Prints a well-formatted report of all players and all of their attributes in columns.
	 */
	public void printPlayerList() {
		PlayerNode current = head;
		System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
		System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
		while (current != null) {
		System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",current.id,current.firstName,current.lastName,current.playerName,current.playerType,current.lifePoints,current.totalScore);
		current = current.next;
		}
		
	}
	
	/*
	 * Overloaded method 1
	 * -->Returns the reference to the node that contains 
	 * the specified playerID, or null if not found in the list.
	 */
	
	public void search(int playerID) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;
	
		if (current.id == playerID) {
			PlayerFound = current;
			count++;
			}
	
		else {
		while (current.next != null) {
			current = current.next;
			if (current.id == playerID) {
				PlayerFound = current;
				count++;
			}
			
		  }
		}
		
		if (count>0) {
			System.out.println("Player has been found!");	
			System.out.println();
			System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
			System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
			System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
			
		}
		else 
			System.out.println("No player found by this ID");	
	}
	
	
	/*
	 * Overloaded method 2
	 * Returns the reference to the node that contains the specified name
	 * (firstName lastName combination), or null if not found in the list.
	 */
	public void search(String firstName, String lastName) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;
		if (firstName.equalsIgnoreCase(current.firstName) || lastName.equalsIgnoreCase(current.lastName)) {
			PlayerFound = current;
			count++;
			}
		while (current.next != null) {
			current = current.next;
			if (firstName.equalsIgnoreCase(current.firstName) || lastName.equalsIgnoreCase(current.lastName)) {
				PlayerFound = current;
				count++;	
	         }
		}
		if (count>0) {
				System.out.println("Player has been found!");	
				System.out.println();
				System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
				System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
				System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
				
			}
			else 
				System.out.println("No player found by this Name");
		}
	
	
	    /*
	     * Overloaded method 3
	     * Returns the reference to the node that contains the specified playerName, or null if not found in the list
	     */
	
	public void search(String playerName) {
		PlayerNode current = head;
		PlayerNode PlayerFound = null;
		int count = 0;

       if (playerName.equalsIgnoreCase(current.playerName)) {
				PlayerFound = current;
				count++;
				}
		

       else {
		while (current.next != null) {
			current = current.next;
			if (playerName.equalsIgnoreCase(current.playerName)) {
				PlayerFound = current;
				count++;
			}
			
		  }
		}
		
		if (count>0) {
			System.out.println("Player found that matches your search!");	
			System.out.println();
			System.out.println("id \t firstName \t lastName \t playerName \t playerType \t lifePoints \t totalScore");
			System.out.println("--- \t --------- \t -------- \t ---------- \t ---------- \t ---------- \t ----------");
			System.out.printf("%2d %13s %13s %20s %13s %12.2f %14d\n",PlayerFound.id,PlayerFound.firstName,PlayerFound.lastName,PlayerFound.playerName,PlayerFound.playerType,PlayerFound.lifePoints,PlayerFound.totalScore);
			
		}
		else 
			System.out.println("No player found by this ID");
		
	}
	
	/*
	 * highScore()
	 * Returns a well-formatted string containing the player with the highest totalScore in the list
	 */
	public String highScore() {
		 
		PlayerNode current = head;
		int high = current.totalScore;
		String name = "";
		
		while (current.next != null) {
			current = current.next;
			if (current.totalScore > high) {
				high = current.totalScore;
				name = current.playerName;
			}
		
		}
		return "Highest Point: "+ high + "\nHigh Scorer: "+name;
	}
	
	/*
	 * LowScore()
	 * Returns a well-formatted string containing the player with the lowest totalScore in the list
	 */
	public String lowScore() {
		PlayerNode current = head;
		int low = current.totalScore;
		String playerName = "";
		
		while (current.next != null) {
			current = current.next;
			if (current.totalScore < low) {
				low = current.totalScore;
				playerName = current.playerName;
			}
		
		}
		return "Lowest Point: "+ low + "\nLow Scorer: "+playerName;
	}

}
