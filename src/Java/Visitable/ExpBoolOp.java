package Visitable;

import java.util.ArrayList;
import Visitor.Visitor;
import Tree.TreeNode;

public class ExpBoolOp extends TreeNode{

	public ExpBoolOp(String n, Object v) {
		super(n, v);
		// TODO Auto-generated constructor stub
	}

	public ExpBoolOp(String n, ArrayList c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}
	
	public Object accept(Visitor visitor){
		return visitor.visit(this);
	}

}