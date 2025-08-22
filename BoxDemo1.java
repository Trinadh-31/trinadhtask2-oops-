package constructors;


class Box
{  
  double width;
  double height;
  double depth;

Box(double w, double h, double d)  //parameterized
   {   
	width = w; height = h; depth = d;
   }

double volume()
  { 
	return width * height * depth;
   }
}

class BoxDemo1
 {
 public static void main(String args[]) 
  { 
    
	Box mybox1 = new Box(8, 11, 15); 
	Box mybox2 = new Box(3, 6, 7); 
	double vol; 
	

	vol = mybox1.volume(); 
	System.out.println("Volume is " + vol);
	
	  
	vol = mybox2.volume(); 
	System.out.println("Volume is " + vol);
 }
 }
