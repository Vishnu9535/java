class stack{
  char[] data;
   int size;
   int top;
   stack(){
    size=50;
     data =new char[size];
     top=-1;
   }
   boolean is_empty(){
    if(top <=-1){
        return true;
    }
    else{
        return false;
    }
    
   }
   boolean is_full(){
    if(top==(size-1)){
        return true;
   }
   else{
    return false;
   }
}


public class balance {
    
}
