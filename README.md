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
