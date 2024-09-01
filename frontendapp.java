static int REV(int n){   
          long RevNumber=0;
          while (n>0)
          {
            RevNumber=(RevNumber*10)+(n%10);
            n=n/10;
          }
          return  (int) RevNumber;   
        }
