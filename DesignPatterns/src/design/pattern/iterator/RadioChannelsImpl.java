package design.pattern.iterator;

/**
 * It is used for test Iterator Design Pattern.
 * @author hpanmand
 *
 */
public class RadioChannelsImpl {
	public static void main(String[] args) {
		RadioChannelCollection radioChannels = addDefaulRadioChannels();
		RadioChannelIterator radioIterator = radioChannels.iterator(RadioChannelLanguageEnum.ALL);
		while (radioIterator.hasNext()) {
			RadioChannel rc = radioIterator.next();
			System.out.println(rc.toString());
		}
		System.out.println("***********************************");
	}

	private static RadioChannelCollection addDefaulRadioChannels() {
		RadioChannelCollection defaultRadioChannels = new RadioChannelCollectionImpl();
		defaultRadioChannels.addChannel(new RadioChannel(91.1, RadioChannelLanguageEnum.ALL));
		defaultRadioChannels.addChannel(new RadioChannel(92.7, RadioChannelLanguageEnum.ENGLISH));
		defaultRadioChannels.addChannel(new RadioChannel(93.5, RadioChannelLanguageEnum.MARATHI));
		defaultRadioChannels.addChannel(new RadioChannel(94.3, RadioChannelLanguageEnum.ENGLISH));
		defaultRadioChannels.addChannel(new RadioChannel(95.1, RadioChannelLanguageEnum.HINDI));
		defaultRadioChannels.addChannel(new RadioChannel(98.3, RadioChannelLanguageEnum.ALL));
		defaultRadioChannels.addChannel(new RadioChannel(101.0, RadioChannelLanguageEnum.MARATHI));
		defaultRadioChannels.addChannel(new RadioChannel(104.2, RadioChannelLanguageEnum.ALL));

		return defaultRadioChannels;
	}
}
