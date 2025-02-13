package designPatterns.adapter.headFirst.enumerationIterator.interfaces;

public interface Iterator<T> {	
	
	public boolean hasNext();	// hasMoreElements?	
	public Object next();		// next Element
	
	public default void remove() {	// remove element
		 throw new UnsupportedOperationException(); // if the remove operation is not supported by this iterator	
	}		
}
