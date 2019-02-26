package Strings;

import java.util.HashMap;

public class FindFirstSubstringOccurrence {
    public static void main(String[] args) {
        String s = "GTgpEYIWKIWrlEtByHryETrBeTWNkHutWKOCvVNRSGSxaynjzTatJMKSwCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKaKfqaOtvO";
        String x = "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa";
        System.out.println(findFirstSubstringOccurrence(s, x));
    }

    static int findFirstSubstringOccurrence(String s, String x) {
        int[] lastIndexOfXTable = new int[256];
        for ( int i = 0; i < 256; i++ ) {
            lastIndexOfXTable[i] = -1;
        }
        for ( int i = 0; i < x.length(); i++ ) {
            lastIndexOfXTable[x.charAt(i)] = i;
        }
        for ( int i = 0; i <= s.length() - x.length(); ) {
            int skip = 0;
            for ( int j = x.length()-1; j >= 0; j-- ) {
                if ( x.charAt(j) != s.charAt(i+j) ) {
                    skip = j - lastIndexOfXTable[s.charAt(i+j)];
                    if (skip < 1) {
                        skip = 1;
                    }
                    break;
                }
            }
            if ( skip == 0 ) {
                return i;
            }
            i+= skip;
        }
        return -1;
    }
}