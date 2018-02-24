package Visitable;

import java.util.ArrayList;
import Visitor.Visitor;
import Tree.TreeNode;

public class DoubleConstant extends TreeNode{

	public DoubleConstant(String n, Object v) {
		super(n, v);
		// TODO Auto-generated constructor stub
	}

	public DoubleConstant(String n, ArrayList c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}
	
	public Object accept(Visitor visitor){
		return visitor.visit(this);
	}

}