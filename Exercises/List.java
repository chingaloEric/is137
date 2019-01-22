//  Question6-linked Lists

class Node{
		int value;
		Node next;

		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
		Node(int value){
			this. value = value;
			this.next = null;
		}

    public Node insert(Node old, int val){
      Node newNode = new Node(val, old);
      return newNode;
    }
    public void printAll(Node point){
      while(point != null){
        System.out.print(point.value + " ");
        point = point.next;
      }
    }

//question 7: insert sorted       <------------------------------------check this, it doesnt run as expected
    public void insertSorted(int targetItem){
    	Node temp;
    	Node point = this.next;
    	while(point != null){
    		if(point.value <= targetItem){
    			Node newNode = new Node(targetItem, point.next);
    			temp = newNode;
    			break;
    		}else{
    			temp = point.next;
    		}
    	}
    }

//Question 6:
    public Node delete(int targetItem){
      Node helper =  new Node(0);
      helper.next = this;
      Node point = helper;
      while(point.next != null){
          if(point.next.value == targetItem){
            Node nextNode = point.next;
            point.next = nextNode.next;
          }else{
            point = point.next;
          }
      }
      return helper.next;
    }

    public static void main(String[] args) {
      Node myList = new Node(12);
      myList = myList.insert(myList, 13);
      myList = myList.insert(myList, 23);
      myList = myList.insert(myList, 30);
      myList.printAll(myList);
      System.out.println(" ");
      myList = myList.delete(13);
      myList.printAll(myList);
    }

}
