class Foo
{
    SynchronousQueue<Integer> sq12,sq23;
    public Foo()
    {
        sq12=new SynchronousQueue<>(true);
        sq23=new SynchronousQueue<>(true);
    }

    public void first(Runnable printFirst) throws InterruptedException
    {
        printFirst.run();
        sq12.put(0);
    }

    public void second(Runnable printSecond) throws InterruptedException
    {
        sq12.take();
        printSecond.run();
        sq23.put(0);
    }

    public void third(Runnable printThird) throws InterruptedException
    {
        sq23.take();
        printThird.run();
    }
}
