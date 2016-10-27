package org.gztech.heartrate.utils;

/**
 * @author ����:
 * @date 2016-4-26 ����6:29:08
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class MindsetManager {

	/**
	 * �������ʵ�����仯�������ʷ�Ϊ���������
	 */

	// RATE_ANGRY=1������
	public static final int RATE_ANGRY = 1;
	// RATE_CALMNESS=2�� ƽ��
	public static final int RATE_CALMNESS = 2;
	// RATE_HAPPY=3������
	public static final int RATE_HAPPY = 3;
	// RATE_EXCITING=4���˷�
	public static final int RATE_EXCITING = 4;

	// ���ʱ仯�İٷֱȣ�����Ϊ����������Ϊ����x%������Ϊ�µ�x%
	private static int[] range;

	public MindsetManager() {
		super();

	}

	public int getMindset(int[] range) {

		int upRange = range[4];
		int downRange = range[5];

		if (upRange > downRange) {

			if (upRange - downRange >= 8) {

				return RATE_EXCITING;

			} else if (upRange - downRange > 0 && upRange - downRange < 5) {

				return RATE_HAPPY;
			}
		} else {

			if (downRange - upRange > 0 && downRange - upRange < 5) {

				return RATE_HAPPY;
			}
		}
		return 2;
	}

	public static String getMindsetString(int mindset) {

		switch (mindset) {
		case RATE_ANGRY:

			return "ANGRY";

		case RATE_CALMNESS:

			return "CALMNESS";

		case RATE_HAPPY:

			return "HAPPY";

		case RATE_EXCITING:

			return "EXCITING";
		}
		return null;
	}

}
