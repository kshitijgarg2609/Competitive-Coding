class BrowserHistory
{
    Stack<String> history;
    Stack<String> forward;
    public BrowserHistory(String homepage)
    {
        history=new Stack<>(){{push(homepage);}};
        forward=new Stack<>();
    }
    
    public void visit(String url)
    {
        history.push(url);
        forward.clear();
    }
    
    public String back(int steps)
    {
        while(steps>0 && history.size()>1)
        {
            forward.push(history.pop());
            steps--;
        }
        return history.peek();
    }
    
    public String forward(int steps)
    {
        while(steps>0 && forward.size()>0)
        {
            history.push(forward.pop());
            steps--;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
