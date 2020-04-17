package com.javainuse.swaggertest;

import java.util.*;

public class PermutationData {
    static int count = 0;

    ArrayList<String> arr = new ArrayList<String>();
    Map<Integer, String> alphaNumberMap = new HashMap<Integer, String>();
    String uniqueString = "";

    public PermutationData() {
        alphaNumberMap.put(2, "ABC");
        alphaNumberMap.put(3, "DEF");
        alphaNumberMap.put(4, "GHI");
        alphaNumberMap.put(5, "JKL");
        alphaNumberMap.put(6, "MNO");
        alphaNumberMap.put(7, "PQRS");
        alphaNumberMap.put(8, "TUV");
        alphaNumberMap.put(9, "WXYZ");
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    public void permute(String str, int l, int r, int page)  {
        findUniqueNumbers(str);
        if (l == r)
        {
            if(str.endsWith("1") || str.endsWith("0"))
            {
                if(arr.contains(str)== false)
                {
                    arr.add(str);
                    count++;
                }
            }
            else  if (str.endsWith("2")) {
                if(arr.contains(str.substring(0, str.length() - 1) + "A")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "A");
                    arr.add(str.substring(0, str.length() - 1) + "B");
                    arr.add(str.substring(0, str.length() - 1) + "C");
                    count= count+ 3;
                }
            }
            else if(str.endsWith("3")){
                if(arr.contains(str.substring(0, str.length() - 1) + "D")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "D");
                    arr.add(str.substring(0, str.length() - 1) + "E");
                    arr.add(str.substring(0, str.length() - 1) + "F");
                    count= count+ 3;
                }
            }else if(str.endsWith("4")){
                if(arr.contains(str.substring(0, str.length() - 1) + "G")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "G");
                    arr.add(str.substring(0, str.length() - 1) + "H");
                    arr.add(str.substring(0, str.length() - 1) + "I");
                    count= count+ 3;
                }
            } else if(str.endsWith("5")){
                if(arr.contains(str.substring(0, str.length() - 1) + "J")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "J");
                    arr.add(str.substring(0, str.length() - 1) + "K");
                    arr.add(str.substring(0, str.length() - 1) + "L");

                    count= count+ 3;
                }
            }else if(str.endsWith("6")){
                if(arr.contains(str.substring(0, str.length() - 1) + "M")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "M");
                    arr.add(str.substring(0, str.length() - 1) + "N");
                    arr.add(str.substring(0, str.length() - 1) + "O");
                    count= count+ 3;
                }
            }else if(str.endsWith("7")){
                if(arr.contains(str.substring(0, str.length() - 1) + "P")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "P");
                    arr.add(str.substring(0, str.length() - 1) + "Q");
                    arr.add(str.substring(0, str.length() - 1) + "R");
                    arr.add(str.substring(0, str.length() - 1) + "S");
                    count= count+ 4;
                }
            }else if(str.endsWith("8")){
                if(arr.contains(str.substring(0, str.length() - 1) + "T")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "T");
                    arr.add(str.substring(0, str.length() - 1) + "U");
                    arr.add(str.substring(0, str.length() - 1) + "V");
                    count= count+ 3;
                }
            }else if(str.endsWith("9")){
                if(arr.contains(str.substring(0, str.length() - 1) + "W")== false)
                {
                    arr.add(str.substring(0, str.length() - 1) + "W");
                    arr.add(str.substring(0, str.length() - 1) + "X");
                    arr.add(str.substring(0, str.length() - 1) + "Y");
                    arr.add(str.substring(0, str.length() - 1) + "Z");
                    count= count+ 4;
                }
            }
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i); //1234 0 1
                if(arr.size() < 500000) {
                    permute(str, l + 1, r, page);
                }
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public void findUniqueNumbers(String str) {
        HashSet<Character> set = new HashSet<Character>();
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        Iterator<Character> iterator = set.iterator();
        String sbString = new String();
        while (iterator.hasNext())
            sbString += iterator.next()+"";
        this.uniqueString =  sbString;
    }
}
