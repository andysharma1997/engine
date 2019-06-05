package engine.utils;

public class SentenceSimilarity {

	/**
	 * Compares s1 against s2 using 35.200.182.146:5010/sentence_similarity
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 * @author andy
	 */
	public float getSimilarity(String s1, String s2) {
		return 0f;
	}

	/**
	 * Compares collection of sentences against one sentence and return the
	 * comparison of s1 against all strings in s
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 * @author andy
	 */
	public float[] getSimilarity(String[] s, String s1) {
		return new float[] {};
	}
}
