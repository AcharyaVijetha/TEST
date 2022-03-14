package com.demo.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



 class EmpD extends Emp {
	

	

	public String findEmpDbById(int  id)  {
		 //List<Integer,Emp> emp=new ArrayList<Integer,Emp>();

	try {
		if (EmpDb.db.containsKey(id)) {
			return  (EmpDb.db.get(id));
		} else {
		return "Employee Not Found";
	}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	//List<String > empDetails=new LinkedList<String>();
	//System.out.println(db);
	}
 }


