package org.jointheleague.ecolban;

import java.util.NoSuchElementException;

/**
 * An immutable list interface.
 * 
 * @author ecolban
 *
 * @param <T>
 */
public interface ImmutableList<T> {
    /**
     * 
     * @return true if and only iff the list is empty
     */
    boolean isEmpty();

    /**
     * 
     * @return the length of the list.
     */
    int length();

    /**
     * An empty list has a string representation: "()" whereas a non-empty list
     * has a string representation "(e1 e2 e3 ...)", where e1, e2, e3, ... are
     * the string representations of the elements of the list.
     * 
     * @return the string representation of the list
     */
    String toString();

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
    ImmutableList<T> remove(T e);

    /**
     * 
     * @param e
     *            the element to push onto the list
     * @return a new list with e added to the beginning of the list.
     */
    ImmutableList<T> push(T e);

    /**
     * 
     * @param e
     *            the new element to append to the list
     * @return a new list with e added to the end of the list.
     */
    ImmutableList<T> append(T e);

    /**
     * 
     * @return the first element of the list.
     * @throws NoSuchElementException
     *             if the list is empty
     */
    T head();

    /**
     * 
     * @return the tail of the list, i.e. a list identical to this except that
     *         it does not have the first element.
     * @throws NoSuchElementException
     *             if the list is empty
     */
    ImmutableList<T> tail();
}
