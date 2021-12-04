package it.polito.tdp.Lab00;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
        EntryPoint.main(args);
        
//		  TEST SULL'ANALISI DEI CARATTERI IN UNA STRINGA
//		        
//        boolean b1;
//        boolean b2;
//        String s;
//        List<String> stringhe = new ArrayList<String>();
//        stringhe.add("");
//        stringhe.add("s");
//        stringhe.add("sw");
//        stringhe.add("1");
//        stringhe.add("13");
//        stringhe.add("1s");
//        stringhe.add("12s");
//        
//        for(String str : stringhe) {        
//        	s = str;
//    		b1 = s.matches("[1-9]*"); 
//            System.out.println("Stringa = \"" + s + "\" - pattern = [1-9]* " + " - match = " + b1);
//            b2 = s.matches("[1-9]+"); 
//            System.out.println("Stringa = \"" + s + "\" - pattern = [1-9]+ " + " - match = " + b2);
//        }
//       
//        System.out.println("\n ----------------------------------- \n");
//
//        for(String str : stringhe) {        
//        	s = str;
//        	b1 = s.matches(".*[1-9]*.*"); 
//            System.out.println("Stringa = \"" + s + "\" - pattern = [1-9]* " + " - match = " + b1);
//            b2 = s.matches(".*[1-9]+.*");
//            System.out.println("Stringa = \"" + s + "\" - pattern = [1-9]+ " + " - match = " + b2);
//        }
//
//        String password = "test"; 
//        s = "test";
//        
//        if(s.matches("[1-9]+")) {
//    		if(s.matches("[1-9]*") == true) {
//    			System.out.println(" la stringa \"matcha\"");
//    		}else {
//    			System.out.println(" la stringa NON \"matcha\"");
//    		}
//   
//    		if(Pattern.matches("[1-9]+", s) == true) {
//	        	System.out.println(" la stringa1 \"matcha\"");
//	        }
//	        if(Pattern.matches("[a-zA-Z]+", s) == false) {
//	        	System.out.println(" la stringa2 \"matcha\"");
//	        }
//        
//        
//        if (password.matches("[a-zA-Z0-9?!@#]*") && 
//				!password.matches("[a-z0-9?!@#]*") && 
//				!password.matches("[a-z0-9]*") && 
//				!password.matches("[a-z]*") &&
//				!password.matches("[A-Z0-9?!@#]*") && 
//				!password.matches("[A-Z0-9]*") &&
//				!password.matches("[A-Z]*") &&
//				!password.matches("[0-9a-zA-Z]*") &&
//				!password.matches("[0-9a-z]*") &&
//				!password.matches("[0-9]*") &&
//				!password.matches("[?!@#a-zA-Z]*") &&
//				!password.matches("[?!@#a-z]*") &&
//				!password.matches("[?!@#]*") 
//				)
//        	System.out.println(" la stringa \"matcha\"");
//        }
	}
}
