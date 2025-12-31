public class DigitalWatch{
  public static void main(String args[]){
	  
	  // For Hours
      for(int i=0;i<24;i++){
		  if(i==13){
			  System.out.println("13:00 \nPower Cut..");
			   break;
		  }
		
        // For Minutes		
	    for(int j=0;j<=59;j++){ 		
		   System.out.printf("%02d:%02d\n",i,j);
		}
		System.out.println();
	  }
  }
}