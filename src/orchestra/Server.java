package orchestra;

import java.util.ArrayList;

public class Server {
	private MusicianFactory p_MusicianFac = new MusicianFactory();
	private ArrayList<IMusician> p_ListOfMusicians = new ArrayList<IMusician>();
	private ArrayList<Partition> p_ListOfPartitions = new ArrayList<Partition>();
	
	public Server() {
	}
	
	public int addMusician(int instrument, String name) {
		IMusician musician = p_MusicianFac.AddMusician(instrument, name);
		if (musician!=null) {
			p_ListOfMusicians.add(musician);
			verification(p_ListOfMusicians.indexOf(musician));
			return p_ListOfMusicians.indexOf(musician);
		}
		verification(-1);
		return -1; //if the instrument doesn't exist
	}
	
	public void removeMusician(int musician) {
		p_ListOfMusicians.set(musician, null);
	}
	
	public void addPartition(String name, String tone) {
		Partition partition = new Partition(name, tone);
		p_ListOfPartitions.add(partition);
		for (IMusician iMus : p_ListOfMusicians) {
			iMus.addPartition(partition);
		}
	}
	
	public int musiciansCounter() {
		int res=0;
		for(int i=0;i<p_ListOfMusicians.size();i++) {
			if(p_ListOfMusicians.get(i)!=null)
				res++;
		}
		return res;
	}
	
	public int partitionCounter() {
		int res=0;
		for(int i=0;i<p_ListOfPartitions.size();i++) {
			if(p_ListOfPartitions.get(i)!=null)
				res++;
		}
		return res;
	}
	
	private static void verification(int M) {
		if(M!=-1)
			System.out.println("Musician added.");
		else
			System.out.println("This instrument doesn't exist.");
	}
}
