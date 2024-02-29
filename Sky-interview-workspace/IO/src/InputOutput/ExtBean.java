package InputOutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExtBean implements Externalizable {

	public int math;
	transient int temp;

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(math);
		out.writeInt(temp);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException {

		math = in.readInt();
		temp = in.readInt();
	}

}
