class Solution {

    public int countCharacters(String[] words, String chars) {

        int count = 0;

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            String temp = chars;

            boolean found = true;

            for(int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                if(!temp.contains(String.valueOf(ch))) {

                    found = false;
                    break;
                }

                else {

                    int index = temp.indexOf(ch);

                    temp = temp.substring(0, index)
                           + temp.substring(index + 1);
                }
            }

            if(found) {

                count = count + word.length();
            }
        }

        return count;
    }
}