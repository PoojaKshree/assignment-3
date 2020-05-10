package huffman;

import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator;

class HuffmanNode { 
  int data; 
  int c; 
  HuffmanNode left; 
  HuffmanNode right; 
} 

class MyComparator implements Comparator<HuffmanNode> { 
  public int compare(HuffmanNode x, HuffmanNode y) 
  { 
    return x.data - y.data; 
  } 
} 

public class Huffman { 
  private static Scanner sc;

public static int printCode(HuffmanNode root) 
  {
	  String s;
	  sc = new Scanner(System.in);
	  System.out.println("Is the sum 5,9,12,13,15,16");
	  s=sc.nextLine();
	  if(s.equalsIgnoreCase("yes")){
		  root=root.left;
		  System.out.println("Is the sum 12 or 9");
		  s=sc.nextLine();
		  if(s.equalsIgnoreCase("yes")){
			  root=root.right;
			  System.out.println("Is the sum 9");
			  s=sc.nextLine();
			  if(s.equalsIgnoreCase("yes")){
				  root=root.right;
				  return root.c;
			  }
			  else{
				  root=root.left;
				  return root.c;
			  }
		  }
		  else{
			  root=root.left;
			  System.out.println("Is the sum 15,16 or 5");
			  s=sc.nextLine();
			  if(s.equalsIgnoreCase("yes")){
				  root=root.right;
				  System.out.println("Is the sum 16 or 5");
				  s=sc.nextLine();
				  if(s.equalsIgnoreCase("yes")){
					  root=root.right;
					  System.out.println("Is the sum 5");
					  s=sc.nextLine(); 
					  if(s.equalsIgnoreCase("yes")){
						  root=root.right;
						  return root.c;
					  }
					  else{
						  root=root.left;
						  return root.c;
					  }
					  
					}
				  else{
					  root=root.left;
					  return root.c;
				  }
				  
			  }
			  else{
				  root=root.left;
				  return root.c;
			  }
		  }
	 }
	  else
		 {root=root.right;
		     System.out.println("Is the sum 10 or 11");
		     s=sc.nextLine();
		     if(s.equalsIgnoreCase("yes")){
		         root=root.left;
		         System.out.println("Is the sum 11");
		         s=sc.nextLine();
		         if(s.equalsIgnoreCase("yes")){
		             root=root.right;
		             return root.c;
		           }
		           else{
		               root=root.left;
		               return root.c;
		           }
		       }
		       else
		       {
		           root=root.right;
		           System.out.println("Is the sum 14 or 7");
		           s=sc.nextLine();
		           if(s.equalsIgnoreCase("yes")){
		               root=root.left;
		               System.out.println("Is the sum 7");
		               s=sc.nextLine();
		               if(s.equalsIgnoreCase("yes")){
		                   root=root.right;
		                   return root.c;
		               }
		               else{
		                   root=root.left;
		                   return root.c;
		               }
		               }
		               else
		               {
		                   root=root.right;
		                   System.out.println("Is the sum 17,3,18,4,6");
		                   s=sc.nextLine();
		                   if(s.equalsIgnoreCase("yes")){
		                       root=root.left;
		                       System.out.println("Is the sum 17,3,18,4");
		                       s=sc.nextLine();
		                       if(s.equalsIgnoreCase("yes")){
		                           root=root.left;
		                           System.out.println("Is the sum 3,18or 4");
		                           s=sc.nextLine();
		                           if(s.equalsIgnoreCase("yes")){
		                               root=root.right;
		                               System.out.println("Is the sum 3 or 18");
		                               s=sc.nextLine();
		                               if(s.equalsIgnoreCase("yes")){
		                                   root=root.left;
		                                   System.out.println("Is the sum 3");
		                                   s=sc.nextLine();
		                               if(s.equalsIgnoreCase("yes")){
		                                   root=root.left;
		                                   return root.c;
		                               }
		                               else
		                               {
		                                   root=root.right;
		                                   return root.c;
		                               }
		                           }
		                           else
		                           {
		                               root=root.right;
		                               return root.c;
		                           }
		                       }
		                       else
		                       {root=root.left;
		                           return root.c;
		                       }
		                   }
		                   else
		                   {
		                       root=root.right;
		                       return root.c;
		                   }
		               }
		               else
		               {
		                   root=root.right;
		                   return root.c;
		               }
		           }
		                       
		       }
		       }
		   }	               


  
  public static void main(String[] args) 
  { 

    int n = 16; 
    int[] charArray = { 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18 }; 
    int[] charfreq = { 1,3,6,10,15,21,25,27,27,25,21,15,10,6,3,1 }; 
 
    PriorityQueue<HuffmanNode> q 
      = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 

    for (int i = 0; i < n; i++) {
      HuffmanNode hn = new HuffmanNode();

      hn.c = charArray[i];
      hn.data = charfreq[i];

      hn.left = null;
      hn.right = null;

      q.add(hn);
    }
    
    HuffmanNode root = null;
    
    while (q.size() > 1) {

      HuffmanNode x = q.peek();
      q.poll();

      HuffmanNode y = q.peek();
      q.poll();

      HuffmanNode f = new HuffmanNode();

      f.data = x.data + y.data;
      f.c = '-';
      f.left = x;
      f.right = y;
      root = f;

      q.add(f);
    }
    System.out.println("sum :"+printCode(root)); 
  } 
}