package design.pattern.iterator;

/**
 * Contains public abstract methods for adding, removing, iterating radio
 * channel.
 * 
 * @author hpanmand
 *
 */
public interface RadioChannelCollection {
	void addChannel(RadioChannel radioChannel);

	void removeChannel(RadioChannel radioChannel);

	RadioChannelIterator iterator(RadioChannelLanguageEnum radioChannelLanguageEnum);
}
