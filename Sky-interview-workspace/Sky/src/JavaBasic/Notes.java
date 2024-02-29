package JavaBasic;

public class Notes {
public static void main(String[] args) {
	int []notes= {2000, 500, 200, 100,50};
	int total=5750;
	int r;
	for (int i = 0; i < notes.length; i++) {
		r= total/notes[i];
		if (r>0) {
			System.out.println(notes[i] +" "+r);
			total=total%notes[i];
		}
	}

}}