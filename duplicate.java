import java.util.*;

public class duplicate{
	public static void main(String[] args){		
					Stack<String> char1 = new Stack<String>();
					Stack<String> char2 = new Stack<String>();
					String st = "This";
					String st1 = "Jh";
					int count = 0;
					for(int i = 0; i < st.length(); i++){
						char1.push(st.substring(i, i+1));
						
					}
					//This
					for(int i = 0; i < st1.length(); i++){					
						char2.push(st1.substring(i, i+1));
					}
					//Jh
					
					/*	
					for(int i = 0; i < st1.length(); i++){
						String top1 = char2.peek();
						for(int j = 0; j < st.length(); j++){
							String top = char1.peek();
							if(char1.search(top1)!= -1){
								char1.removechar1.search(top1);
								char2.remove(0);
								counter++;
							}


							
							
						}
					}
					*/
					while(char2.size() !=0){
						String top1 = char2.peek();
						String top = char1.peek();
						if(char1.search(top1)!= -1){
								char1.remove(char1.search(top1));
								char2.remove(0);
								count++;
						}
						else{
							char2.remove(0);
						}
						
						
						
						
					}
					
					
					
					int len = st.length();					
					System.out.print(count);
				 
				 
	}

}
