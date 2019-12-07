package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

	private String testing;
	
	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return testing;
	}

	@Override
	public void setString(String string) {
		// TODO Auto-generated method stub
		this.testing = string;
	}

	@Override
	//This counts how many numbers there are in a string
	public int countNumbers() {
		if(this.testing == null) {
			throw new NullPointerException();
		}
		int count = 0;
		for (int i = 0, len = this.testing.length(); i < len; i++) {
		    if (Character.isDigit(getString().charAt(i))) {
		        count++;
		    }
		}
		return count;
	}

	@Override
	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		if(this.testing == null) {
			throw new NullPointerException();
		}
		if(n<=0) {
			throw new IllegalArgumentException();
		}
		if(n >this.testing.length()) {
			throw new IllegalArgumentException();
		}
		StringBuffer tempString = new StringBuffer();
		int tempCharLoc;
		char tempChar;
		int i = 1;
		if(!startFromEnd) {
		while(n*i <= this.testing.length()) {
			tempChar = this.testing.charAt((n*i)-1);
			tempString.append(tempChar);
			i++;
		}
		String finalString = tempString.toString();
		return finalString;
		}
		else {
			while(n*i <= this.testing.length()) {
				
				tempCharLoc = this.testing.length() - ((n*i));
				tempChar = this.testing.charAt(tempCharLoc);				
				tempString.insert(0,tempChar);
				i++;
			}
			String finalString = tempString.toString();
			
			return finalString;
			}
			
		}
	 
	

	@Override
	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		   if (this.testing == null) {
	            throw new NullPointerException();
	        }
		   if ((startPosition > endPosition)) {
	            throw new IllegalArgumentException();
	        }

	        if (endPosition > this.testing.length() || (startPosition < 1)){
	            throw new MyIndexOutOfBoundsException();
	        }
	        
	        StringBuffer tempString = new StringBuffer();
	        String digit = new String();
	        boolean done = false;
	        for (int i = 0; i < this.testing.length(); i++) {
	            char ch = this.testing.charAt(i);
	            if ((i < startPosition - 1) || (i > endPosition - 1)) {
	                if(done) {
	                    done = false;
	                }
	                tempString.append(ch);
	                continue;
	            }
	            else{
	            	if (Character.isDigit(ch)) {
	            
	                    switch (ch) {
	                        case '0':
	                            digit = "Zero";
	                            break;
	                        case '1':
	                            digit = "One";
	                            break;
	                        case '2':
	                            digit = "Two";
	                            break;
	                        case '3':
	                            digit = "Three";
	                            break;
	                        case '4':
	                            digit = "Four";
	                            break;
	                        case '5':
	                            digit = "Five";
	                            break;
	                        case '6':
	                            digit = "Six";
	                            break;
	                        case '7':
	                            digit = "Seven";
	                            break;
	                        case '8':
	                            digit = "Eight";
	                            break;
	                        case '9':
	                            digit = "Nine";
	                            break;
	                    }
	                    if(done)
	                        tempString.append(digit.toLowerCase());
	                    else 
	                        tempString.append(digit);
	                    done = true;
	                    
	                } 
	            	else {
	                    if(done){
	                        done = false;}
	                    tempString.append(ch);      
	        }
	        }
	}
	 this.testing = tempString.toString();
	 setString(tempString.toString());
	}

	
	

}
