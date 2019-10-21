package design.pattern.iterator;

/**
 * Contains public abstract methods used for radio channel traversal.
 * 
 * @author hpanmand
 *
 */
public interface RadioChannelIterator {
	public boolean hasNext();

	public RadioChannel next();
}
