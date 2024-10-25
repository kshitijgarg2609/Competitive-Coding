class Solution
{
    class Trie extends HashMap<String,Trie>
    {
        boolean endFolder=false;
        public void insert(String folder)
        {
            Trie t=this;
            for(String f : folder.split("/"))
            {
                if(f.equals(""))
                {
                    continue;
                }
                t=t.computeIfAbsent(f,k->new Trie());
            }
            t.endFolder=true;
        }
        public boolean isSubFolder(String folderName)
        {
            Trie t=this;
            for(String f : folderName.split("/"))
            {
                if(f.equals(""))
                {
                    continue;
                }
                if(t.endFolder)
                {
                    return true;
                }
                t=t.get(f);
            }
            return false;
        }
    }
    public List<String> removeSubfolders(String[] folder)
    {
        Trie t = new Trie();
        for(String fol : folder)
        {
            t.insert(fol);
        }
        List<String> list = new LinkedList<>();
        for(String fol : folder)
        {
            if(!t.isSubFolder(fol))
            {
                list.add(fol);
            }
        }
        return list;
    }
}
