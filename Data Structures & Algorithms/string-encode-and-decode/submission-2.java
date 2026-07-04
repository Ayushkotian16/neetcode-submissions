class Solution {

    public String encode(List<String> strs) {
        String encode = "";

        for (String word : strs) {
            encode += "-l" + word;
        }

        return encode;
    }

    public List<String> decode(String str) {
        List<String> decode = new ArrayList<>();

        String[] parts = str.split("-l", -1);

        for (int i = 1; i < parts.length; i++) {
            decode.add(parts[i]);
        }

        return decode;
    }
}