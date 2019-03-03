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
    
    
    
  } 
  
  def main(args: Array[String]): Unit = {
    
  }

}

