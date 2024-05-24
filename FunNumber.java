public class FunNumber
  {
    private int myNum;
    private String myNumStr; 


    public FunNumber(int n) //creates an int and string with the same input
    {
      myNum = n;
      myNumStr = Integer.toString(n); 
      
    }

    public int numDigits()//returns length of string
    {
    
      return myNumStr.length();
      
    }

    public int sumDigits() //uses mod to break apart digit by digit
    {
      int sum = 0;
      int tempVal = myNum;
      while(tempVal != 0)
      {
        sum += tempVal%10;
        tempVal = tempVal/10;
        
      }
      return sum;
    }

    public boolean isPerfect()//looks for factors and adds them all up
    {
      int temp = myNum;
      int sum = 0;

      for(int i = 1; i<temp; i++)
        {
          
          if(temp%i == 0)
          {
            sum += i;
          }
        }

      if(sum == myNum && myNum != 0) //0 was annoying to fix so i made it a special case
      {
        return true;
      }
      else
        return false;
    }

    public boolean isPrime() //copied loop from isPerfect but slightly modified
    {
      if(myNum==1 || myNum==0) {return false;}// special case

      int counter = 0;
      for(int i = 1; i<=myNum; i++)
      {
        if(myNum%i == 0)
        {
          counter++;
        }
        
      }

      return !(counter > 2);//more factors than itself and one
      

      
      
    }
  
    public FunNumber reverseNum()
    {
      int temp = myNum;
      int rev = 0;
      while(temp != 0) // found example loop from CSA
        {
          int val = temp % 10;
          rev = rev * 10 + val;
          temp = temp/10;
        }
      FunNumber reversed = new FunNumber(rev);// created new object because unsure about editing myNum
      return reversed;//returns new object that only holds reversed new num


      
    }


    
    public String toString() //mainly used for reversed str
    {
      return myNumStr;
    }
    
    
  }