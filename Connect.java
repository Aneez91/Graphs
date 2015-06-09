
import java.util.Scanner;

public class Bridge {
    private int bridges;      // number of bridges
    private int cnt;          // counter
    private int[] pre;        // pre[v] = order in which dfs examines v
    private int[] low;        // low[v] = lowest preorder of any vertex connected to v

    public Bridge(Graph G) {
        low = new int[G.V()];
        pre = new int[G.V()];
        for (int v = 0; v < G.V(); v++) low[v] = -1;
        for (int v = 0; v < G.V(); v++) pre[v] = -1;
        
        for (int v = 0; v < G.V(); v++)
            if (pre[v] == -1)
                dfs(G, v, v);
    }

    public int components() { return bridges + 1; }

    private void dfs(Graph G, int u, int v) {
        pre[v] = cnt++;
        low[v] = pre[v];
        for (int w : G.adj(v)) {
            if (pre[w] == -1) {
                dfs(G, v, w);
                low[v] = Math.min(low[v], low[w]);
                if (low[w] == pre[w]) {
                    System.out.println(v + "-" + w + " is a bridge");
                    bridges++;
                }
            }

            // update low number - ignore reverse of edge leading to v
            else if (w != u)
                low[v] = Math.min(low[v], pre[w]);
        }
    }

    // test client
    public static void main(String[] args) {
       /* int V = Integer.parseInt(args[0]);
        int E = Integer.parseInt(args[1]);
      */  /*Graph G = GraphGenerator.simple(V, E);
        System.out.println(G);*/
    	criticalBridges(1,"({A,B,C},{(A,B),(B,C),(A,C)})");
        Scanner in=new Scanner(System.in);
        Graph G = new Graph(in);
        System.out.println(G);
        Bridge bridge = new Bridge(G);
        System.out.println("Edge connected components = " + bridge.components());
    }
    public static String criticalBridges(int input1,String input2)
    {
    	String inputs[]=new String[input1];
    	inputs=input2.split("}\\)");
    	for(String str:inputs)
    	{//&&edge_arr[i].length()>0
    		String edges[]=str.split("}");
    		int no_of_vertices=(edges[0].split(",")).length;
    		String edge_arr[]=edges[1].split(",");
    		for(int i=1;i<edge_arr.length;i++)
    		{
    			String start=""+edge_arr[i].charAt(edge_arr[i++].length()-1);
    			if(start.equals(")"))
    					continue;
    			String end=""+edge_arr[i].charAt(0);
    			System.out.println(start+"\t"+end);
    		}
    	}
    	return"";
    }



}
