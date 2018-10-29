/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;


    /**
     * This method allows adding a message object to the existing queue.
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage){


        P2PMessage oldlast = new P2PMessage();
        oldlast = tail;

        P2PMessage last = oMessage;

        if (hasNodes())
            head = last;
        else
            oldlast.next = last;

    }


    /**
     * This method allows removing a message object from the existing queue.
     * @return
     */
    public synchronized P2PMessage dequeue(){
        return head;
    }


    public boolean hasNodes(){
        return (this.head == null);
    }
}

