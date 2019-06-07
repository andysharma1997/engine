package engine.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SentenceSimilarityTest {
	@Test
	public void testGetSimilarity() {
		SentenceSimilarity sentenceSimilarity = new SentenceSimilarity();
		assertEquals(1.0f, sentenceSimilarity.getSimilarity("hello", "hello"), 0f);
		assertArrayEquals(new float[] { 1.0f }, sentenceSimilarity.getSimilarity(new String[] { "hello" }, "hello"),
				0f);
	}
}
