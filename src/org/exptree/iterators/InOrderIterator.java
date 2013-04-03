/**
 * 
 */
package org.exptree.iterators;


/**
 * @author Purna
 *
 */
public class InOrderIterator implements ETIterator{

	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public InOrderIterator clone() throws CloneNotSupportedException {
		return (InOrderIterator) super.clone();

	}
}
