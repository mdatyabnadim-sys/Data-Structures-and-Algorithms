class smallest_letter_greater_than_target_brute_force{
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}