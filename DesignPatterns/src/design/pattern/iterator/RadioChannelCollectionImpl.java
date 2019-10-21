package design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * It contains implementation of ChannelCollection interface.
 * 
 * @author hpanmand
 *
 */
public class RadioChannelCollectionImpl implements RadioChannelCollection {
	private List<RadioChannel> radioChannelList;

	/**
	 * Create new radio channel list
	 */
	RadioChannelCollectionImpl() {
		radioChannelList = new ArrayList<>();
	}

	/**
	 * Add new radio channel to list
	 */
	@Override
	public void addChannel(RadioChannel radioChannel) {
		radioChannelList.add(radioChannel);
	}

	/**
	 * Remove radio channel from list
	 */
	@Override
	public void removeChannel(RadioChannel radioChannel) {
		radioChannelList.remove(radioChannel);
	}

	/**
	 * Used to iterate the radio channels
	 */
	@Override
	public RadioChannelIterator iterator(RadioChannelLanguageEnum radioChannelLanguage) {
		return new RadioChannelIteratorImpl(radioChannelLanguage, this.radioChannelList);
	}

	private class RadioChannelIteratorImpl implements RadioChannelIterator {
		private RadioChannelLanguageEnum radioChannelLanguage;
		private int position;
		private List<RadioChannel> radioChannels;

		RadioChannelIteratorImpl(RadioChannelLanguageEnum radioChannelLanguage, List<RadioChannel> radioChannelList) {
			this.radioChannelLanguage = radioChannelLanguage;
			this.radioChannels = radioChannelList;
		}

		@Override
		public boolean hasNext() {
			while (position < radioChannels.size()) {
				RadioChannel radioChannel = radioChannels.get(position);

				// if caller requested for ALL then return all radio channels
				if (radioChannel.getRadioChannelLanguage().equals(this.radioChannelLanguage)
						|| this.radioChannelLanguage.equals(RadioChannelLanguageEnum.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public RadioChannel next() {
			RadioChannel retRadioChannel = radioChannels.get(position);
			position++;
			return retRadioChannel;
		}
	}
}
