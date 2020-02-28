package orchestra;

import java.util.ArrayList;

public class MusicianPiano implements IMusician {
	private String p_name;
	private String p_instrument="Piano";
	private ArrayList<Partition> p_partitions = new ArrayList<Partition>();
	
	public MusicianPiano(String name) {
		p_name=name;
	}
	
	public void addPartition(Partition partition) {
		p_partitions.add(partition);
		System.out.println("The partition \"" + partition.getName() + "\" has been given to " + p_name + " who plays " + p_instrument + ".");
	}
	
	public void removePartition(Partition partition) {
		p_partitions.remove(partition);
		System.out.println("The partition \"" + partition.getName() + "\" has been taken from " + p_name + " who plays " + p_instrument + ".");
	}

	//GETTERS
	public String getName() {
		return p_name;
	}
	
	public String getInstrument() {
		return p_instrument;
	}
	
	public ArrayList<Partition> getPartitions() {
		return p_partitions;
	}
	
	//SETTERS
	public void setName(String name) {
		this.p_name = name;
	}
}
