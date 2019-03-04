/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import scala.collection.immutable.List;

trait Queue[T] {
  def isEmpty: Boolean
  def enQueue(t: T): Queue[T]
  // Removes the element at the beginning of the immutable queue, and returns the new queue.
  def deQueue(): Queue[T]
  def head: Option[T]
}


object Queue  {
  def empty[T]: Queue[T] = {
      return new IQueue[T];
    
  }
   
  class IQueue[T] extends Queue[T]{
    
    private var front: List[T] = List.empty[T]
    private var rear: List[T] = List.empty[T]
    private var size:Int = 0
   
       
    def this(front: List[T], rear: List[T])
    {
       this()
       this.front = front
       this.rear = rear
       this.size = this.front.size + this.rear.size
    }
    def enQueue(t:T): Queue[T]={
        return new IQueue[T](this.front , this.rear :+ t);
    }
   
    def deQueue: Queue[T] = { 
        var q: Queue[T] = null;
        if ( front.isEmpty)
             q = new IQueue[T](this.rear.reverse.init, List.empty[T]);
          else 
             q = new IQueue[T](this.front.init, this.rear); 
        
        return q;

    }
    def  head(): Option[T] = {
        
        if (this.front.isEmpty)
            return this.rear.reverse.lastOption;
        return this.front.lastOption;
    }
    def isEmpty(): Boolean = {return size == 0;}
    
    
    
  } 
  
}

object Test{
 def main(args: Array[String]): Unit = {
    var q:Queue[String] = Queue.empty[String]
    assert(q.enQueue("1").enQueue("2").deQueue.enQueue("3").head.head == "2")
    assert(q.enQueue("1").enQueue("2").deQueue.deQueue.isEmpty == true)

  }
}
  
