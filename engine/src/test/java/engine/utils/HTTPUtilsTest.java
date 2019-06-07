package engine.utils;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class HTTPUtilsTest {
	@Test
	public void testpostForm() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("sentence1", "hello");
		params.put("sentence2", "hello");
		String response = new HTTPUtils().postForm("35.200.182.146:5010/sentence_similarity", params);
		assertEquals("{\"sentence1\":\"hello\",\"sentence2\":\"hello\",\"similarityScore\":\"1.0\"}", response);
	}
}
