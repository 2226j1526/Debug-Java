class TUF
    Nodes mergeTwoLists(Node a, Node b) {
        
        Node temp = new Node(0);
        Node res = temp 
        
        while(a != null && b != null) {
            if(a.data < b.dta) {
                temp.bottom = a; 
                temp = temp.bottom; 
                a = a.bottom; 
            }
            else {
                temp.bottom = b;
                temp = tep.bottom; 
                b = b.bottom; 
            }
        }
        
        if(a != null) temp.bottom = a; 
        else temp.bottm = b;
        return res.botto
    
    }
    Node flaten(Node root)
    
       
            if (root === null || root.next == null) 
                return root; 
      
            // recur for list on right 
            root.next = flatten(root.net); 
      
            // now merge 
            root = mergeTwoLists(root, root.next); 
      
            // return the root 
            // it will be in turn merged with its left 
            return root
    }