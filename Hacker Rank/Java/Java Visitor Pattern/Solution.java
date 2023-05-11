import java.util.*;

abstract class Tree
{
    int value;
    int color;
    int depth;
    Tree(int value,int color,int depth)
    {
        this.value=value;
        this.color=color;
        this.depth=depth;
    }
    int getValue()
    {
        return value;
    }
    int getColor()
    {
        return color;
    }
    int getDepth()
    {
        return depth;
    }
    abstract void accept(TreeVis vis);
}

class TreeNode extends Tree
{
    List<Tree> child = new ArrayList<>();
    TreeNode(int value,int color,int depth)
    {
        super(value,color,depth);
    }
    public void accept(TreeVis vis)
    {
        vis.visitNode(this);
        for(Tree tree : child)
        {
            tree.accept(vis);
        }
    }
    void addChild(Tree tree)
    {
        child.add(tree);
    }
}

class TreeLeaf extends Tree
{
    TreeLeaf(int value,int color,int depth)
    {
        super(value,color,depth);
    }
    public void accept(TreeVis vis)
    {
        vis.visitLeaf(this);
    }
}

abstract class TreeVis
{
    int result;
    TreeVis(int result)
    {
        this.result=result;
    }
    abstract int getResult();
    abstract void visitNode(TreeNode node);
    abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis
{
    SumInLeavesVisitor()
    {
        super(0);
    }
    public int getResult()
    {
        return result;
    }
    public void visitNode(TreeNode node)
    {
        
    }
    public void visitLeaf(TreeLeaf leaf)
    {
        result+=leaf.getValue();
    }
}

class ProductRedNodesVisitor extends TreeVis
{
    final long mod=(long)(1E9+7);
    ProductRedNodesVisitor()
    {
        super(1);
    }
    public int getResult()
    {
        return result;
    }
    public void visitNode(TreeNode node)
    {
        visit(node);
    }
    public void visitLeaf(TreeLeaf leaf)
    {
        visit(leaf);
    }
    void visit(Tree tree)
    {
        if(tree.getColor()==0)
        {
            result=(int)((1L*result*tree.getValue())%mod);
        }
    }
}

class FancyVisitor extends TreeVis
{
    FancyVisitor()
    {
        super(0);
    }
    public int getResult()
    {
        return Math.abs(result);
    }
    public void visitNode(TreeNode node)
    {
        if(node.getDepth()%2==0)
        {
            result+=node.getValue();
        }
    }
    public void visitLeaf(TreeLeaf leaf)
    {
        if(leaf.getColor()==1)
        {
            result-=leaf.getValue();
        }
    }
}

public class Solution
{
    public static List<List<Integer>> node_data = new ArrayList<>();
    public static List<List<Integer>> edges = new ArrayList<>();
    public static void acceptInputs()
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        edges.add(new ArrayList<>());
        for(int i=0;i<n;i++)
        {
            node_data.add(new ArrayList<>(Arrays.asList(sc.nextInt())));
            edges.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            node_data.get(i).add(sc.nextInt());
        }
        for(int i=1;i<n;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            edges.get(u).add(v);
            edges.get(v).add(u);
        }
        sc.close();
    }
    public static void reduceCycle()
    {
        Queue<Integer> qu = new LinkedList<>();
        boolean vis[] = new boolean[edges.size()];        
        qu.add(1);
        while(!qu.isEmpty())
        {
            int visting_node = qu.remove();
            vis[visting_node]=true;
            Iterator<Integer> it = edges.get(visting_node).iterator();
            while(it.hasNext())
            {
                int ch=it.next();
                if(vis[ch])
                {
                    it.remove();
                }
                else
                {
                    qu.add(ch);
                }
            }
        }
    }
    public static Tree buildTree(int node,int depth)
    {
        if(edges.get(node).size()==0)
        {
            return new TreeLeaf(node_data.get(node-1).get(0),node_data.get(node-1).get(1),depth);
        }
        TreeNode tree = new TreeNode(node_data.get(node-1).get(0),node_data.get(node-1).get(1),depth);
        for(int child : edges.get(node))
        {
            tree.addChild(buildTree(child,depth+1));
        }
        return tree;
    }
    public static void main(String args[])
    {
        acceptInputs();
        reduceCycle();
        Tree root = buildTree(1,0);
        SumInLeavesVisitor sum_vis = new SumInLeavesVisitor();
        ProductRedNodesVisitor prod_vis = new ProductRedNodesVisitor();
        FancyVisitor fancy_vis = new FancyVisitor();
        root.accept(sum_vis);
        root.accept(prod_vis);
        root.accept(fancy_vis);
        System.out.println(sum_vis.getResult());
        System.out.println(prod_vis.getResult());
        System.out.println(fancy_vis.getResult());
    }
}
