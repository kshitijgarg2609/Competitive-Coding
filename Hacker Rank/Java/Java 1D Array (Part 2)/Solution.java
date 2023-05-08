import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        Queue<Integer> qu = new LinkedList<>();
        boolean vis[] = new boolean[game.length];
        if(game[0]==0) {
            qu.add(0);
            vis[0]=true;
        }
        while(!qu.isEmpty()) {
            int r = qu.remove();
            if((r+1)>=game.length || (r+leap)>=game.length) {
                return true;
            }
            if(r!=0 && !vis[r-1] && game[r-1]==0) {
                vis[r-1]=true;
                qu.add(r-1);
            }
            if(!vis[r+1] && game[r+1]==0) {
                vis[r+1]=true;
                qu.add(r+1);
            }
            if(!vis[r+leap] && game[r+leap]==0) {
                vis[r+leap]=true;
                qu.add(r+leap);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
