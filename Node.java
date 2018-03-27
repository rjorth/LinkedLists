public class Node<T>
{
    T cargo;
    Node<T> child;

    public Node(T cargo)
    {
        this.cargo = cargo;
        child = null;
    }

    public Node(T cargo, Node<T> child)
    {
        this.cargo = cargo;
        this.child = child;
    }
}

	
