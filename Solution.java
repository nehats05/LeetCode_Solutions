class Solution {
    public int lengthOfLongestSubstring(String s) throws StringIndexOutOfBoundsException
    {
         String simple=s.substring(0,s.length()); //take substring
        int max=1;
        if(simple.length()==0)
        {
            max=0;
        } 
          Set<Character> res = new HashSet<>();  //create set to store the substring
             for(int i=0;i<simple.length();i++)
             {
               if(res.contains(simple.charAt(i))) //compare the char with the res set
                     {
                         if(max<res.size()) 
                             max=res.size();     //get maxlength
                         res.remove(simple.charAt(i));
                        // int index = simple.indexOf(simple.charAt(i));
                         //res.clear();              
                     simple=simple.substring(simple.indexOf(simple.charAt(i))+1);
                                                //get the index
                       //  i=index;
                      //  System.out.println(simple);
                      //  System.out.println(res);
                    }
                 
                    else
                    {
                        res.add(simple.charAt(i));
                       // System.out.println(res);
                        if(max<res.size()) 
                             max=res.size();
                    }
             }
     //   System.out.println(max);
        return max;
    }

	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    String s = input.next();
	    lengthOfLongestSubstring(s);
	}
}