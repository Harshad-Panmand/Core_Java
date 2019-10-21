package design.pattern.iterator;

/**
 * Used for storing radio channel information.
 * 
 * @author hpanmand
 *
 */
public class RadioChannel {
	private double frequency;
	private RadioChannelLanguageEnum language;

	RadioChannel(double frequency, RadioChannelLanguageEnum radiChannelLanguage) {
		this.frequency = frequency;
		this.language = radiChannelLanguage;
	}

	public RadioChannelLanguageEnum getRadioChannelLanguage() {
		return this.language;
	}

	public double getRadioChannelFrequency() {
		return this.frequency;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Language=" + this.language;
	}
}
