package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */

    public Integer countYZ(String input){

    String temp [ ] = input.split(" ");
    int count = 0; {
            for (int i = 0; i < temp.length; i++){
     if (temp[i].endsWith("y") || temp[i].endsWith("z"))
    count +=1;}
    return count;}}


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove)
    {
        String result = "";
        for (int i = 0; i < base.length(); i++) {
            if (i > base.length() - remove.length()) {
                result += base.substring(i, base.length());
                break;
            } else {
                String substring = base.substring(i, i + remove.length());
                if (!(substring.equalsIgnoreCase(remove))) {
                    result += base.charAt(i);
                } else {
                    i = i + remove.length() - 1;
                }
            }
        }
        return result;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

            int len = input.length();
            int not = 0;
            int is = 0;
            for (int i = 0; i < len; i++) {
                if (i < len - 2) {
                    String tmp = input.substring(i,i+3);
                    if (tmp.equals("not"))
                    not= not+1;
                }
                if (i < len - 1) {
                    String tmp2 = input.substring(i,i+2);
                    if (tmp2.equals("is"))
                    is= is +1;
                }
            }
            if (not == is)
            return true;
            else
            return false;
        }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
    //    public boolean gHappy(String str) {
            int len = input.length();
            boolean happy = true;
            for (int i = 0; i < len; i++) {
                if (input.charAt(i) == 'g') {
                    if (i > 0 && input.charAt(i-1) == 'g')
                    happy = true;
      else if (i < len-1 && input.charAt(i+1) == 'g')
                    happy = true;
      else
                    happy = false;
                }

            }
            return happy;
        }



        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
public Integer countTriple(String input){
        int count = 0;
        int lim = input.length() - 2;
        for(int i = 0; i < lim; i++)
        {
            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == input.charAt(i+2))
                count++;
        }
        return count;
    }
}

