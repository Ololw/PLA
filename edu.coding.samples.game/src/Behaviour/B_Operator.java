package Behaviour;

public abstract class B_Operator implements Operator {

	Behaviour lopd;
	Behaviour ropd;

	boolean res;
	boolean end;
	Behaviour todo;

	public boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean is_end() {
		if (end == false && (lopd.is_end() && ropd.is_end())) {
			end = true;
		}
		return end;
	}

}
