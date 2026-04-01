import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphQues {
  public static void bfs(int start, ArrayList<ArrayList<Integer>>graph,boolean[] visited){
      Queue<Integer> q =new LinkedList<>();
      q.add(start);
      visited[start]=true;
      while(!q.isEmpty()){
          int curr=q.remove();
          System.out.println(curr+" ");
          for(int i:graph.get(curr)){
              if(!visited[i]){
                  visited[i]=true;
                  q.add(i);
              }
          }
      }
  }

    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            
        }
    }
}
