import java.awt.*;
class Solution
{
    public void solveSudoku(char[][] board)
    {
      LinkedList<Point> emp = new LinkedList<Point>();
      for(int i=0;i<9;i++)
      {
        for(int j=0;j<9;j++)
        {
          if(board[i][j]=='.')
          {
            emp.add(new Point(i,j));
          }
        }
      }
      int i=0;
      while(i!=emp.size())
      {
        Point pop=emp.get(i);
        if(board[pop.x][pop.y]=='9')
        {
          board[pop.x][pop.y]='.';
          i--;
          continue;
        }
        boolean val=false;
        trial:
        for(int k=(board[pop.x][pop.y]=='.')?'1':(char)(board[pop.x][pop.y]+1);k<='9';k++)
        {
          val=true;
          board[pop.x][pop.y]=(char)(k);
          for(int j=0;j<9;j++)
          {
            if(pop.y==j)
            {
              continue;
            }
            if(board[pop.x][pop.y]==board[pop.x][j])
            {
              val=false;
              continue trial;
            }
          }
          for(int j=0;j<9;j++)
          {
            if(pop.x==j)
            {
              continue;
            }
            if(board[pop.x][pop.y]==board[j][pop.y])
            {
              val=false;
              continue trial;
            }
          }
          int a=(pop.x/3)*3;
          int b=(pop.y/3)*3;
          for(int p=a;p<a+3;p++)
          {
            for(int q=b;q<b+3;q++)
            {
              if(p==pop.x && q==pop.y)
              {
                continue;
              }
              if(board[pop.x][pop.y]==board[p][q])
              {
                val=false;
                continue trial;
              }
            }
          }
          if(val)
          {
            break;
          }
        }
        if(!val)
        {
          board[pop.x][pop.y]='.';
          i--;
          continue;
        }
        i++;
      }
    }
}