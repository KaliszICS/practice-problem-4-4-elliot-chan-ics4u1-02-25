/**
 * Utility class containing various conversion and string-processing methods.
 * Designed by Elliot Chan.
 * @author Elliot Chan
 * @version 17.0.1
 */
final class CampbellClass {

    // Private constructor prevents instantiation of this utility class
    private CampbellClass() {}

    /**
     * Converts an integer to its string representation.
     * @param num The integer to convert
     * @return A string equivalent of the provided integer
     */
    public static String convertString(int num) {
        return String.valueOf(num);
    }

    /**
     * Converts a double to its string representation.
     * @param num The double to convert
     * @return A string version of the specified double value
     */
    public static String convertString(double num) {
        return String.valueOf(num);
    }

    /**
     * Converts a boolean to its string representation.
     * @param bool The boolean to convert
     * @return A string representing the boolean value
     */
    public static String convertString(boolean bool) {
        return String.valueOf(bool);
    }

    /**
     * Converts a character to its string representation.
     * @param c The character to convert
     * @return A string form of the input character
     */
    public static String convertString(char c) {
        return String.valueOf(c);
    }

    /**
     * Converts a distance from metres to centimetres.
     * @param num The number of metres
     * @return The equivalent number of centimetres as an integer
     */
    public static int convertMetersToCenti(int num) {
        return num * 100;
    }

    /**
     * Converts a double value in metres to centimetres.
     * @param num The number of metres
     * @return The equivalent distance in centimetres as a double
     */
    public static double convertMetersToCenti(double num) {
        return num * 100;
    }

    /**
     * Removes any characters from the input string that are not alphabetic.
     * @param s The string to process
     * @return A new string containing only letters from the original input
     */
    public static String removeNonAlpha(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Filters out all non-letter characters from the input string and changes case.
     * @param s The string to process
     * @param casing If true, returns the result in uppercase; otherwise, in lowercase
     * @return A cleaned-up string with only letters, in the specified case format
     */
    public static String removeNonAlpha(String s, boolean casing) {
        String newString = s.replaceAll("[^a-zA-Z]", "");
        if (casing) return newString.toUpperCase();
        return newString.toLowerCase();
    }
}
