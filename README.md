# Graphs
"http://algs4.cs.princeton.edu/41undirected/"
https://developer.mozilla.org/en-US/docs/Web/Security/Insecure_passwords
Arrays.sort(input1);
		int sum=0;
		int temp=0;
		for(int i=0;i<input3;i++)
		{
		 
			sum+=(input1[i]-temp)*(input2-i);
			temp+=(input1[i]-temp);
		/*	for(int j=i+1;j<input1.length;j++)
			{
				input1[j]=input1[j]-input1[i];
			}*/
		}
		return sum;
  Arrays.sort(input1);
  Arrays.sort(input2);
  for(int i=0;i<input1.length;i++)
  {
	  if(input1[i]<0||input2[i]<0)
		  return "Invalid";
	  if(input1[i]!=input2[i])
		  return "Unequal"; 
		  
  }
  return "Equal";



	        //Write code here
		   String str="abedc";
		   Set<Character> s=new HashSet<Character>();
		   for(int i=0;i< input1.length();i++)
		   {
			   s.add(input1.charAt(i));
		   }
		   String ret="";
		   if(s.size()==5)
		   {
			   ret=input1.replaceAll("a", "0").replaceAll("b", "10").replaceAll("c", "1110").replaceAll("d", "1111").replaceAll("e","110");
				return ret;	   
		   }
		   if(!s.contains('a')&&s.size()==4)
		   {
			   ret=input1.replaceAll("b", "0").replaceAll("c", "110").replaceAll("d", "111").replaceAll("e","10");
			   return ret;
		   }
		   if(!s.contains('b')&&s.size()==4)
		   {
			   ret=input1.replaceAll("a", "0").replaceAll("c", "110").replaceAll("d", "111").replaceAll("e","10");
			   return ret;
		   }
		   if(!s.contains('e')&&s.size()==4)
		   {
			   ret=input1.replaceAll("a", "0").replaceAll("b", "10").replaceAll("d", "111").replaceAll("c","110");
			   return ret;
		   }
		   if(!s.contains('c')&&s.size()==4)
		   {
			   ret=input1.replaceAll("a", "0").replaceAll("b", "10").replaceAll("d", "111").replaceAll("e","110");
			   return ret;
		   }
	    
