
package challenges;

public class NumberThree {
    /**
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     *
     * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
     * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     *
     * The method should return a new string representing the input time in 24 hour format.
     *
     * timeConversion has the following parameter(s):
     *
     * Example:
     * s: 07:05:45AM
     * return: 07:05:45
     *
     * Example:
     * s: 07:05:45PM
     * return: 19:05:45
     *
     * @param s a string representing time in 12 hour format
     * @return the string s in 24 hour format
     */
    public String timeConversion(String s) {
        if (s.contains( "AM"))
        {
            if (s.substring(0,2).equals("12"))
            {
                return "00" + s.substring(2,8);
            }
            return s.substring (0,8);
        }
        if (s.contains("PM"))
        {
            if (s.substring(0,2).equals ("12"))
            {
                return s.substring(0,8);
            }
            int x = Integer.parseInt(s.substring(0,2));
            x+=12;
            return x + s.substring (2,8);
        }

        return s.substring(0,8);
    }
}
