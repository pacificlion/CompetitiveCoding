package com.pacificlion.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 1410. HTML Entity Parser
 * 
 * HTML entity parser is the parser that takes HTML code as input and replace
 * all the entities of the special characters by the characters itself.
 * 
 * The special characters and their entities for HTML are:
 * 
 * Quotation Mark: the entity is &quot; and symbol character is ". Single Quote
 * Mark: the entity is &apos; and symbol character is '. Ampersand: the entity
 * is &amp; and symbol character is &. Greater Than Sign: the entity is &gt; and
 * symbol character is >. Less Than Sign: the entity is &lt; and symbol
 * character is <. Slash: the entity is &frasl; and symbol character is /. Given
 * the input text string to the HTML parser, you have to implement the entity
 * parser.
 * 
 * Return the text after replacing the entities by the special characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: text = "&amp; is an HTML entity but &ambassador; is not."
 * 
 * Output: "& is an HTML entity but &ambassador; is not."
 * 
 * Explanation: The parser will replace the &amp; entity by &
 * 
 * Example 2:
 * 
 * Input: text = "and I quote: &quot;...&quot;"
 * 
 * Output: "and I quote: \"...\""
 * 
 * Example 3:
 * 
 * Input: text = "Stay home! Practice on Leetcode :)"
 * 
 * Output: "Stay home! Practice on Leetcode :)"
 * 
 * Example 4:
 * 
 * Input: text = "x &gt; y &amp;&amp; x &lt; y is always false"
 * 
 * Output: "x > y && x < y is always false"
 * 
 * Example 5:
 * 
 * Input: text = "leetcode.com&frasl;problemset&frasl;all"
 * 
 * Output: "leetcode.com/problemset/all"
 * 
 * 
 * Constraints:
 * 
 * 1 <= text.length <= 10^5 The string may contain any possible characters out
 * of all the 256 ASCII characters.
 * 
 * @author pacificlion
 *
 */
public class _1410 {
	
	//String builder approach one pass
	public static class Solution1 {
	    
	    /*
	    Quotation Mark: the entity is &quot; and symbol character is ".
	Single Quote Mark: the entity is &apos; and symbol character is '.
	Ampersand: the entity is &amp; and symbol character is &.
	Greater Than Sign: the entity is &gt; and symbol character is >.
	Less Than Sign: the entity is &lt; and symbol character is <.
	Slash: the entity is &frasl; and symbol character is /.
	    */
	    public String entityParser(String text) {
	        Map<String, String> map = new HashMap<>();
	        map.put("&apos;", "'");
	        map.put("&gt;", ">");
	        map.put("&lt;", "<");
	        map.put("&frasl;", "/");
	        map.put("&amp;", "&");
	        map.put("&quot;", "\"");
	        
	        StringBuilder ans= new StringBuilder();
	        int i =0;
	        int start =0;
	        int deleteStart =0;
	        while(i <text.length()){
	            ans.append(text.charAt(i));
	           if(text.charAt(i)=='&'){
	               start = i;
	               deleteStart = ans.length()-1;
	           } 
	            else if(text.charAt(i)==';'&& map.containsKey(text.substring(start, i+1))){
	                ans.replace(deleteStart, ans.length(),map.get(text.substring(start, i+1)));
	            }
	            i++;
	        }
	        return ans.toString();
	    }
	}
	
	// replace all approach
	public static class Solution2 {
	    
	    /*
	    Quotation Mark: the entity is &quot; and symbol character is ".
	Single Quote Mark: the entity is &apos; and symbol character is '.
	Ampersand: the entity is &amp; and symbol character is &.
	Greater Than Sign: the entity is &gt; and symbol character is >.
	Less Than Sign: the entity is &lt; and symbol character is <.
	Slash: the entity is &frasl; and symbol character is /.
	    */
	    public String entityParser(String text) {
	        text = text.replaceAll("&quot;", "\"")
	        .replaceAll("&apos;", "'")
	        .replaceAll("&gt;", ">")
	        .replaceAll("&lt;", "<")
	        .replaceAll("&frasl;", "/")
	        .replaceAll("&amp;", "&");
	        return text;
	    }
	}
	
	// stack based approach
	public static class Solution3 {
	    
	    /*
	    Quotation Mark: the entity is &quot; and symbol character is ".
	Single Quote Mark: the entity is &apos; and symbol character is '.
	Ampersand: the entity is &amp; and symbol character is &.
	Greater Than Sign: the entity is &gt; and symbol character is >.
	Less Than Sign: the entity is &lt; and symbol character is <.
	Slash: the entity is &frasl; and symbol character is /.
	    */
	    public String entityParser(String text) {
	        Map<String, String> map = new HashMap<>();
	        map.put("&apos;", "'");
	        map.put("&gt;", ">");
	        map.put("&lt;", "<");
	        map.put("&frasl;", "/");
	        map.put("&amp;", "&");
	        map.put("&quot;", "\"");
	        
	        Stack<Character> st = new Stack<>();
	        StringBuilder res= new StringBuilder();
	        int i =0;
	        while(i < text.length()){
	            if(text.charAt(i)==';'){
	                String temp="";
	                String temp1="";
	                while(!st.isEmpty() && st.peek()!='&'){
	                    temp =st.pop()+temp;
	                }
	                
	                if(!st.isEmpty() && st.peek()=='&'){
	                    st.pop();
	                    temp=map.getOrDefault('&'+temp+";", '&'+temp+";");
	                }
	                else{
	                    temp+=";";
	                }
	                while(!st.isEmpty()){
	                 temp1 = st.pop()+temp1;
	                }
	                res.append(temp1);
	                res.append(temp);
	            }
	            else{
	                st.push(text.charAt(i));
	               
	            }
	            i++; 
	        }
	        String temp ="";
	         while(!st.isEmpty()){
	           temp = st.pop()+temp;
	         }
	                
	        res.append(temp);
	        return res.toString();
	    }
	}
}
