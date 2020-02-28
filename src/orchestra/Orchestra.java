package orchestra;

public class Orchestra {
	
	public static void main(String[] args) {
		Server server = new Server();
		
		int P = server.addMusician(1, "Pierre");		
		int V = server.addMusician(2, "Paul");		
		int T = server.addMusician(3, "Jacques");		
		int E = server.addMusician(8, "Claude");
		
		System.out.println("There are " + server.musiciansCounter() + " musicians in this orchestra.");
		
		int P2 = server.addMusician(1, "Patrick");
		
		System.out.println("There are " + server.musiciansCounter() + " musicians in this orchestra.");
		
		server.addPartition("Partition 1", "B");
		
		server.addPartition("Partition 2", "G");
	}
	
	
}
