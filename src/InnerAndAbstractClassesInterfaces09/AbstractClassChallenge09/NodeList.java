package InnerAndAbstractClassesInterfaces09.AbstractClassChallenge09;

public interface NodeList{
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
