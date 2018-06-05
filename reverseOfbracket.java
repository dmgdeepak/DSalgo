Count reversal needed to make perfect bracket
Idea is to exclude all complete bracket and then find count of open bracket.
Ans will be size of excluded array and count%2
return ceil(m/2) + ceil(n/2) which is
where m and n are diff kind of bracket
    // actually equal to (m+n)/2 + n%2 when
    // m+n is even

 public static int reversal(String str)
     {
         if(str.length()%2!=0)
         return -1;
         Stack<Character> st=new Stack<Character>();
         for(int i=0;i<str.length();++i)
         {
             char t=str.charAt(i);
             if(t=='}' && !st.isEmpty())
             {
                 if(st.peek()=='{')
                 st.pop();
                 else
                 st.push(t);
             }
             else
             st.push(t);
         }
         int size=st.size();
          int n = 0;
        while (!st.empty() && st.peek() == '{')
        {
            st.pop();
            n++;
        }
        return (size/2+n%2);
     }