package org.jointheleague.ecolban;

public class ListNode<T> implements ImmutableList<T> {

    private final T head;
    private final ImmutableList<T> tail;
    private final int length;

    public ListNode(T head, ImmutableList<T> tail) {
        //1. Complete
    }

    @Override
    public boolean isEmpty() {
        //2. Add return statement
    }

    @Override
    public int length() {
        //3. Add return statement
    }

    @Override
    public ImmutableList<T> remove(T e) {
        int c = countOccurences(e);
        return remove(e, c);
    }

    private int countOccurences(T e) {
        //4. Complete
    }

    private ImmutableList<T> remove(T e, int c) {
        //5. Complete Hint: Use recursion 
    }

    @Override
    public ImmutableList<T> push(T e) {
        //6. Add return statement
    }

    @Override
    public ImmutableList<T> append(T e) {
        //7. Complete. Hint: Use recursion
    }

    @Override
    public T head() {
        //8. Add return statement
    }

    @Override
    public ImmutableList<T> tail() {
        //9. Add return statement
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        //10. Complete 
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        return 101 * (17 * head.hashCode() + tail.hashCode());
    }
    
    @Override
    public boolean equals(Object that) {
        if(that == null || !(that instanceof ListNode<?>)) {
            return false;
        }
        
        //11. Complete. List are equal if they have the same length and elements are pairwise equal.
    }

}
