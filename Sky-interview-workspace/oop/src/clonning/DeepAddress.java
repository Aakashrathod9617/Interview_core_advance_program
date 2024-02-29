package clonning;

public class DeepAddress implements Cloneable {
public String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
