class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder magazineSB = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int index = magazineSB.indexOf(String.valueOf(ch));
            if (index >= 0) magazineSB.deleteCharAt(index);
            else return false;
        }
        return true;
    }
}