package Behaviour;

import java.util.*;

public class Op_Or extends B_Operator {

	Behaviour lopd;
	Behaviour ropd;

	boolean res;
	boolean end;
	Behaviour todo;

	Op_Or(Behaviour left, Behaviour right) {
		lopd = left;
		ropd = right;
		todo = lopd;
		res = false;
	}

	public boolean exec(Stack<Operator> StackOp) {
		Operator LastOp = StackOp.peek();
		if (this != LastOp) {
			StackOp.push(this);
			res = lopd.exec();
		} else {
			res = res || ropd.exec();
		}
		return res;
	}

	/*public boolean is_end() {
		return end;
	}*/
}
