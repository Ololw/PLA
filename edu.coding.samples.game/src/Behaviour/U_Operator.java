package Behaviour;

public abstract class U_Operator implements Operator {

	Behaviour opd;

	boolean res;
	boolean end;

	public boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean is_end() {
		if (end == false && opd.is_end()) {
			end = true;
		}
		return end;
	}

}
