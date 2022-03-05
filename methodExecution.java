//method demo
public class methodExecution {

public int multipynumbers(int x,int y) {
	int z=x*y;
	return z;
}

public static void main(String[] args) {

	methodExecution y=new methodExecution();
	int ans= y.multipynumbers(20,6);
	System.out.println("Multipilcation is :"+ans);
	}


//call by value
public class callMethod {

int val=300;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public void main(String args[]) {
	callMethod p = new callMethod();
	System.out.println("Before operation value of data is "+p.val);
	p.operation(100);
	System.out.println("After operation value of data is "+p.val);
	}
}



//method overloading
public class overloadMethod {
	
public void area(int y,int q)
    {
         System.out.println("Area of Triangle : "+(0.5*y*q));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public  void main(String args[])
   {

overloadMethod ob=new overloadMethod();
       ob.area(10,12);
       ob.area(5);  
   }
}
}
