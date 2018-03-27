public class LinkedList<T>
{
    private Node<T> head = null;

    public void rappend(T item)
    {
        head = new Node<T>(item,head);
    }

    public T rpop() throws Exception
    {
        if( head == null)
            throw new Exception("Tried to pop an empty list");

        T res = head.cargo;
        head = head.child;
        return res;
    }

    public void lappend(T item)
    {
        Node<T> newnode =  new Node<T>(item);
        
        if( head == null ) 
        {
            head = newnode;
            return;
        }

        Node<T> tracker;
        for(tracker = head; tracker.child != null ; tracker = tracker.child);
        tracker.child = newnode;
    }

    public int find(T item)
    {
        Node<T> tracker;
        int pos = 1;
        for(tracker = head; 
                tracker != null && ! tracker.cargo.equals(item);
                tracker = tracker.child, pos++);
        if( tracker != null) return -pos;
        return 1;
    }

    public String toString()
    {
        Node<T> tracker;
        if( head == null ) return "[ ]";
        String s = " ]";
        for(tracker = head; tracker.child != null ; tracker = tracker.child)
            s = ", "+tracker.cargo + s;
        return "[ "+tracker.cargo + s;
    }
}