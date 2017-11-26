//Author - Manish Bhardwaj
package com.sample.app;

public class Lock {
     private Integer keyValue;

     private boolean locked;

     public Lock(Integer keyValue){
         this.keyValue=keyValue;
         this.locked=true;
     }

     public boolean unlock(Integer keyValue){
         if(this.keyValue==keyValue){
             this.locked=false;
             return true;
         }else{
             this.locked=true;
             return false;
         }
     }

     public void lock(){
         locked=true;
     }

     public boolean isLocked(){
         return locked;
     }
}
