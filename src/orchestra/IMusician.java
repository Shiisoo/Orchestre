package orchestra;

import java.util.ArrayList;

public interface IMusician {
	public void addPartition(Partition partition);
	public void removePartition(Partition partition);
	
	//GETTERS
	public String getName();
	public String getInstrument();
	public ArrayList<Partition> getPartitions();
	
	//SETTERS
	public void setName(String name);
}
