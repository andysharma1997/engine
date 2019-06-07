package engine.utils;


import java.util.HashMap;

import engine.utils.HTTPUtils;


import com.google.gson.JsonObject;




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
		String url = "35.200.182.146:5010/sentence_similarity";
		HashMap<String, String> values= new HashMap<String, String>();
		values.put("sentence1",s1);
		values.put("sentence2", s2);
		HTTPUtils obj=new HTTPUtils();
		String result=obj.postForm(url, values);
		JsonObject jobject= new JsonObject();
		JsonObject jobj=jobject.getAsJsonObject(result);
		 float output=jobj.getAsJsonObject("similarityScore").getAsFloat(); 
	  return output;
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
