class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generateParenthesis(result, 0, 0, "", n);
        return result;
    }

    public void generateParenthesis(List<String> result, int open, int close, String processed, int max) {
        if (processed.length() == (2 * max)) {
            result.add(processed);
            return;
        }

        if (open < max) {
            generateParenthesis(result, open + 1, close, processed + "(", max);
        }

        if (close < open) {
            generateParenthesis(result, open, close + 1, processed + ")", max);
        }
    }
}