package orchestra;

public class MusicianFactory {
	
	public IMusician AddMusician(int instrument, String name) {
		if (instrument==1) {
			return new MusicianPiano(name);
		}
		if (instrument==2) {
			return new MusicianViolin(name);
		}
		if (instrument==3) {
			return new MusicianTrumpet(name);
		}
		
		return null; //in other cases
	}
}
