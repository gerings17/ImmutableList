package org.jointheleague.ecolban;

public class ListNode<T> {

    private final T head;
    private final ListNode<T> tail;
    private final int length;

    public ListNode(T head, ListNode<T> tail) {
    	this.head = head;
    	this.tail = tail;
    	length = tail.length() + 1;
        // 1. Complete
    }

    // Package private constructor only to be used for 
    // a call to super() in the EmptyList constructor.
    ListNode() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    /**
     * 
     * @return true if and only iff the list is empty
     */
    public boolean isEmpty() {
    	return false;
        // 2. Add return statement
    }

    /**
     * 
     * @return the length of the list.
     */
    public int length() {
        // 3. Add return statement
    }

    /**
     * Returns a reference to a list where all occurrences of e have been
     * removed and is otherwise equal to this. The method duplicates as few
     * nodes as possible. For example, if this has no element equal to e, then
     * this is returned. If this.tail() has no occurrences of e, then the
     * returned list and this share the same tail.
     * 
     * @param e
     *            the element to remove
     * 
     * @return a list with all occurrences of e removed
     */
    public ListNode<T> remove(T e) {
        int c = countOccurences(e);
        return remove(e, c);
    }

    private int countOccurences(T e) {
        // 4. Complete
    }

    private ListNode<T> remove(T e, int c) {
        // 5. Complete Hint: Use recursion
    }

    /**
     * 
     * @param e
     *            the element to push onto the list
     * @return a new list with e added to the beginning of the list.
     */
    public ListNode<T> push(T e) {
        // 6. Add return statement
    }

    /**
     * 
     * @param e
     *            the new element to append to the list
     * @return a new list with e added to the end of the list.
     */
    public ListNode<T> append(T e) {
        // 7. Complete. Hint: Use recursion
    }

    /**
     * 
     * @return the first element of the list.
     * @throws NoSuchElementException
     *             if the list is empty
     */
    public T head() {
        // 8. Add return statement
    }

    /**
     * 
     * @return the tail of the list, i.e. a list identical to this except that
     *         it does not have the first element.
     * @throws NoSuchElementException
     *             if the list is empty
     */
    public ListNode<T> tail() {
        // 9. Add return statement
    }

    /**
     * An empty list has a string representation: "()" whereas a non-empty list
     * has a string representation "(e1 e2 e3 ...)", where e1, e2, e3, ... are
     * the string representations of the elements of the list.
     * 
     * @return the string representation of the list
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        // 10. Complete
        sb.append(')');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return 101 * (17 * head.hashCode() + tail.hashCode());
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof ListNode<?>)) {
            return false;
        }
        @SuppressWarnings("unchecked")
        ListNode<T> that = (ListNode<T>) other;
        // 11. Complete. List are equal if they have the same length and
        // elements are pairwise equal.

    }

}
