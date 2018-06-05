/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> in, Interval newInterval) {
        ArrayList<Interval> res=new ArrayList<Interval>();
        int n=in.size();
        if (n == 0)
   {
       res.add(newInterval);
       return res;
   }
        //case 1: if Interval comes at pos 1
          if(newInterval.end<in.get(0).start)
          {
            res.add(newInterval);
            for(int i=0;i<n;++i)
            res.add(in.get(i));
            return res;
          }
          //case 2: if last
          if(newInterval.start>in.get(n-1).end)
          {
            for(int i=0;i<n;++i)
            res.add(in.get(i));
              res.add(newInterval);
              return res;
          }
          //case 3 if it overlaps with all Interval
          if(newInterval.start<=in.get(0).start && newInterval.end>=in.get(n-1).end)
          {
            res.add(newInterval);
            return res;
          }
          //case 4 if it comes between two Interval
          for(int i=0;i<n;++i)
          {
            boolean isOverlap=(Math.min(in.get(i).end,newInterval.end)>=Math.max(in.get(i).start,newInterval.start));
            if(!isOverlap)
          {  res.add(in.get(i));
            if(i<n && in.get(i).end<newInterval.start && newInterval.end<in.get(i+1).start)
            res.add(newInterval);
            continue;
          }
          // case 5 if it overlaps
          Interval temp=new Interval();
          temp.start=Math.min(in.get(i).start,newInterval.start);
          ///loop till newInterval overlaps with next intervals
          while(i<n && isOverlap)
          {
            temp.end=Math.max(in.get(i).end,newInterval.end);
            if(i+1<n)
            isOverlap=(Math.min(in.get(i+1).end,newInterval.end)>=Math.max(in.get(i+1).start,newInterval.start));
            else
            isOverlap=false;
            ++i;
          }
          --i;
          res.add(temp);
          }
          return res;
    }
}
