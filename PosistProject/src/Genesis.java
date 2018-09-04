import java.util.*;


public class Genesis {

	Node genesis;

	public class Node {
		 Scanner sc=new Scanner(System.in);

		Date timestamp = new Date("DD/MM/YYYY");
		String data;
		int nodeNumber;
		String nodeId; // 32 bit id that uniquely identifies a node
		Node referenceNodeId; // address of parent node

		Node childReferenceNodeId; // address of the children
		// constructor to intialize node

		public   Node(int nodeNumber) {
			this.data = data;
			this.nodeNumber = nodeNumber;
			this.nodeId = nodeId;
			this.referenceNodeId = null;
			this.childReferenceNodeId = null;
		}
	}

	public   Genesis() {
		this.genesis = null;
	}
	 
	 private Node childNode(Node genesis){
		 Node nn= new Node(3);
		 if(genesis==null){
			 genesis=nn;
			 nn.data="A";
			 nn.nodeId="0000";
			 return genesis;
			 
		 }
		 else
		 {
			
			if(nn.nodeNumber < genesis.nodeNumber) {
				Node temp=childNode(genesis.childReferenceNodeId);
				temp.referenceNodeId=nn;
				return genesis;
			}
			else
				return genesis;
		 }
	 }
	  // public method to call private method
	 
	  public void childNode(){
		  genesis=childNode(genesis);
	  } 
	  
	  // to print longest chain of geneiss node
	  
	   public void leftChain(Node genesis){
		   if(genesis==null)
			   return;
		   else{
			   System.out.print(genesis.data+" ");
			  leftChain(genesis.childReferenceNodeId);
		   }
		   
			   
	   }
	   
	   // longest chain in tree
	   
	    public void longestChain(Node genesis){
	    	if(genesis==null)
	    		return;
	    	else {
	    		System.out.print(genesis.data);
	    		longestChain(genesis.childReferenceNodeId);
	    		longestChain(genesis.referenceNodeId);
	    	}
	    }
	     
	    public void HashValue(){
	    	Set<String,Integer, String, String, Node, Node> hash= new HashMap<String,Integer, String, String, Node, Node>();
	    	
	    	hash.put("A",1, "0101","2","C",genesis.childReferenceNodeId,genesis.referenceNodeId);
	    	hash.put("A",1, "0101","2","C",genesis.childReferenceNodeId,genesis.referenceNodeId);
	    	hash.put("A",1, "0101","2","C",genesis.childReferenceNodeId,genesis.referenceNodeId);
	    	
	    }
	    
	     }


