package org.jointheleague.ecolban;

import java.util.NoSuchElementException;

public class EmptyList<T> extends ListNode<T> {
    
    @SuppressWarnings("rawtypes")
    private static EmptyList instance = new EmptyList();
    
    private EmptyList() {
        super();
    }
    
    @SuppressWarnings("rawtypes")
    public static EmptyList getInstance() {
        return instance;
    }

    @Override
    public boolean isEmpty() {
    	return true;
    }

    @Override
    public ListNode<T> remove(T e) {
    	return this;
        //2. Add a return statement
    }

    @Override
    public int length() {
    	return 0;
        //3. Add a return statement
    }

    @Override
    public ListNode<T> push(T e) {
        //4. Add a constructor to the ListNode class first, then add a return statement
    	return new ListNode<T>(e, this);
    }

    @Override
    public ListNode<T> append(T e) {
        //5. Add a constructor to the ListNode class first, then add a return statement
    	return new ListNode<T>(e,this);
    }

    @Override
    public T head() {
    	throw new NoSuchElementException("EmptyList has no head.");
        //6. Throw an appropriate exception
    }

    @Override
    public ListNode<T> tail() {
    	throw new NoSuchElementException("EmptyList has no tail.");
        //7. Throw an appropriate exception
    }
    
    @Override
    public String toString() {
        //8. Complete Hint: Read the javadoc!
    	return "()";
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
    
    @Override
    public boolean equals(Object that) {
        return that == this;
    }

}
