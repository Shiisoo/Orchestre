package orchestra;

public class Orchestra {
	
	public static void main(String[] args) {
		Server server = new Server();
		int P = server.addMusician(1, "Pierre");
		int V = server.addMusician(2, "Paul");
		int T = server.addMusician(3, "Jacques");
		server.addPartition("Partition 1", "B");
		server.addPartition("Partition 2", "G");
	}
}
