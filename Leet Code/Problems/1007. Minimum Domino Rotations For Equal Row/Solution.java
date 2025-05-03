class Solution
{
    public int minDominoRotations(int[] tops, int[] bottoms)
    {
        boolean flg[] = new boolean[]{true,true,true,true,true,true,true};
        IntStream.range(0,tops.length).forEach(i->IntStream.rangeClosed(1,6).filter(j->flg[j] && tops[i]!=j && bottoms[i]!=j).forEach(j->flg[j]=false));
        return IntStream.rangeClosed(1,6).filter(f->flg[f]).flatMap(f->IntStream.of((int)Arrays.stream(tops).filter(t->t!=f).count(),(int)Arrays.stream(bottoms).filter(b->b!=f).count())).min().orElse(-1);
    }
}
