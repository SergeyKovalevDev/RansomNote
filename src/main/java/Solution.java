class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        StringBuilder magazineSB = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            int index = magazineSB.indexOf(String.valueOf(ch));
            if (index >= 0) magazineSB.deleteCharAt(index);
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}