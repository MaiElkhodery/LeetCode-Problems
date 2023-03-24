class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> lettersOfDigits = new HashMap<>();
        lettersOfDigits.put('2', "abc");
        lettersOfDigits.put('3', "def");
        lettersOfDigits.put('4', "ghi");
        lettersOfDigits.put('5', "jkl");
        lettersOfDigits.put('6', "mno");
        lettersOfDigits.put('7', "pqrs");
        lettersOfDigits.put('8', "tuv");
        lettersOfDigits.put('9', "wxyz");
        
        ArrayList<String> list = new ArrayList<>();
        switch (digits.length()) {
            case 0:
                break;
            case 1:
                for (int i = 0; i < lettersOfDigits.get(digits.charAt(0)).length(); i++) {
                    list.add(lettersOfDigits.get(digits.charAt(0)).charAt(i) + "");
                }
                break;
            case 2:
                for (int i = 0; i < lettersOfDigits.get(digits.charAt(0)).length(); i++) {
                    for (int j = 0; j < lettersOfDigits.get(digits.charAt(1)).length(); j++) {
                        list.add(lettersOfDigits.get(digits.charAt(0)).charAt(i)+"" + lettersOfDigits.get(digits.charAt(1)).charAt(j) );
                    }
                    
                }
                break;
            case 3:
                for (int i = 0; i < lettersOfDigits.get(digits.charAt(0)).length(); i++) {
                    for (int j = 0; j < lettersOfDigits.get(digits.charAt(1)).length(); j++) {
                        for (int k = 0; k < lettersOfDigits.get(digits.charAt(2)).length(); k++) {
                            list.add(lettersOfDigits.get(digits.charAt(0)).charAt(i)+ "" + lettersOfDigits.get(digits.charAt(1)).charAt(j)
                                    + lettersOfDigits.get(digits.charAt(2)).charAt(k) );
                        }
                    }
                    
                }
                break;
            case 4:
                for (int i = 0; i < lettersOfDigits.get(digits.charAt(0)).length(); i++) {
                    for (int j = 0; j < lettersOfDigits.get(digits.charAt(1)).length(); j++) {
                        for (int k = 0; k < lettersOfDigits.get(digits.charAt(2)).length(); k++) {
                            for (int t = 0; t < lettersOfDigits.get(digits.charAt(3)).length(); t++) {
                                list.add(lettersOfDigits.get(digits.charAt(0)).charAt(i)+ "" + lettersOfDigits.get(digits.charAt(1)).charAt(j)
                                        + lettersOfDigits.get(digits.charAt(2)).charAt(k) + lettersOfDigits.get(digits.charAt(3)).charAt(t));
                            }
                        }
                    }
                    
                }
                break;
            default:
                throw new AssertionError();
        }
        return list;
    }
}