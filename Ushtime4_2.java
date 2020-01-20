class Ushtime4_2{
    void U4_2(){
    int n = 1; 
    double x = 0; 
    double s = 1;

    while(s>0.01){
        s = 1.0 / (n * n); 
        x = x + s;
        n++;
    }
    System.out.println("The X is: "+x+", and the sum is: "+s+", this run for "+n+" times.");
  }
}