package org.example.HashTable;

public class CanConstruct {
//  383. Ransom Note
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        int[] ints = new int[26];

        for (char c : magazineChars){
            ints[c - 'a'] += 1;
        }

        for (char c : ransomNoteChars){
            ints[c - 'a'] -= 1;
        }

        for (int a : ints){
            if (a < 0) return false;
        }
        return true;
    }
}
