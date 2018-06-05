import java.util.*;  
import java.util.Comparator;

class minHeapNode
{
    char data;
    int freq;
    minHeapNode left,right;
    
    public minHeapNode(char d,int i)
    {
        data = d;
        freq =i;
        left =null;
        right = null;
    }
    public minHeapNode(char d,int i,minHeapNode l,minHeapNode r)
    {
        data = d;
        freq = i;
        left = l;
        right = r;
    }

    public char getData() {
        return data;
    }

    public int getFreq() {
        return freq;
    }
}



public class HuffmanEncoding {

    
    public void huffmanCode(PriorityQueue<minHeapNode> q)
    {
        minHeapNode l = null;
        minHeapNode r = null;
        minHeapNode top = null;
        while(q.size()>1)
        {
           l = q.poll();
           r = q.poll();
           int d = l.getFreq() + r.getFreq();
           top = new minHeapNode('$', d,l,r);            // $ special value for internal nodes
           q.add(top);
        }
        printCodes(q.poll(), "");
    }
    
    void printCodes(minHeapNode tree,String str)
    {
        if(tree == null)
            return;
        if(tree.data !='$')
            System.out.println(tree.data+" "+str);
        printCodes(tree.left, str+"0");
        printCodes(tree.right, str+"1");
    }
    
    public static void main(String[] args) {
        
        HuffmanEncoding hh = new HuffmanEncoding();
        Comparator<minHeapNode> cmp = new Comparator<minHeapNode>()
        {
            @Override 
            public int compare(minHeapNode o1,minHeapNode o2)
            {
                return Integer.compare(o1.getFreq(), o2.getFreq());
            }
        };
        
        PriorityQueue<minHeapNode> h = new PriorityQueue<minHeapNode>(cmp);
        
        h.add(new minHeapNode('a', 5));
        h.add(new minHeapNode('b', 9));
        h.add(new minHeapNode('c', 12));
        h.add(new minHeapNode('d', 13));
        h.add(new minHeapNode('e', 16));
        h.add(new minHeapNode('f', 45));
   
        
        hh.huffmanCode(h);
    }
}