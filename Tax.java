import java.util.*;
class Tax {
    public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        int op=0;int flag=1;
       Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
       char a[]=str.toCharArray();
       for(int i=0;i<a.length;i++)
       {
           char ch=a[i];
           if(map.containsKey(ch))
           map.put(ch,map.get(ch)+1);
           else
           map.put(ch,1);
       }
       Iterator<Character>charIterator=map.keySet().iterator();
       while(charIterator.hasNext()){
		   
           char ch=charIterator.next();
        Iterator<Character>charI=map.keySet().iterator();
        while(charI.hasNext()){
            char c=charI.next();
            if(ch!=c)
            {
				if(map.get(ch)==map.get(c))
               flag=0;
            }
			else
				flag=1;
        }
		if(flag==1)
		{
			op++;
		}
		
       }
       System.out.print(op);
       

    }
}
