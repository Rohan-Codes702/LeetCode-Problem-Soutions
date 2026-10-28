class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder str = new StringBuilder();

        String s[] = sentence.split(" ");

        for (int i = 0; i < s.length; i++) {
            String word=s[i];
            for (int j = 0; j < dictionary.size(); j++) {
                String l = dictionary.get(j);

                if (word.startsWith(l)) {
                    if(l.length()<word.length()){
                        word=l;
                    }
                }

            }
            str.append(word);
            if(i<s.length-1){
                str.append(" ");
            }

        }
        return str.toString();
    }
}