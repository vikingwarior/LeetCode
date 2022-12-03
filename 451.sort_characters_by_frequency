class Pair {
    char ch;
    int freq;
    Pair(char c) {
        this.ch = c;
        this.freq = 0;
    }
    Pair(char c, int f) {
        this.ch = c;
        this.freq = f;
    }
}

class Solution {
    public String frequencySort(String s) {
        Pair[] characters = new Pair[123];
		for (int i = 0; i < 123; i++) {
			characters[i] = new Pair((char)i);
		}
		
		for (char ch : s.toCharArray()) {
			characters[ch].freq += 1;
		}
		
		Arrays.sort(characters, (p1, p2) -> p2.freq - p1.freq);
		
		StringBuilder ans = new StringBuilder();
		for (Pair p : characters) {
			int freq = p.freq;
			char ch = p.ch;
			while (freq-- > 0) {
				ans.append(ch);
			}
		}
		
		return ans.toString();
    }
}
