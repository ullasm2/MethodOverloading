package org.india;

public class test1 {


public static void main(String[] args) {
		
String name = "Ullas";
String firstName = "Ullas";

	
//Char At (Ullas = 3rd Letter "a") Predefine method to pass index
char c = name.charAt(3);
System.out.println(c);


// toUpperCase (To convert to Upper Case)
String u = name.toUpperCase();
System.out.println(u);

//toLowerCase (To Convert to lower Case)

String l = name.toLowerCase();
System.out.println(l);

//equals - Case Sensitive
boolean eq = name.equals(firstName);
System.out.println(eq);

//equals Ignore Case - Not a case sensitive
boolean ei = name.equals(firstName);
System.out.println(ei);

// startsWith ( Case Sensitive)

boolean sw = name.startsWith("U");
System.out.println(sw);

// endsWith
boolean ew = name.endsWith("s");
System.out.println(ew);

// indexof (Prints character Index Value) 

int i = name.indexOf('a');
System.out.println(i);

//lastIndexof ( Prints last character Index Value)

int li = name.lastIndexOf('s');
System.out.println(li);

// contains (Checks whether the Character is present in the name)
boolean co = name.contains("p");
System.out.println(co);

// replace (replaces the character)
String re = name.replace('s', 'h');
System.out.println(re);

// replaces all
String lastName ="Gangadharan";
String ra = lastName.replace("Gan", "ppp");
System.out.println(ra);

// Concat (First Name+Last Name)
String con = name.concat(lastName);
System.out.println(con);

//length
int le = name.length();
System.out.println(le);

//isEmpty
boolean emp = name.isEmpty();
System.out.println(emp);

//trim
String trm = " Welcome To Java ";
String trim = trm.trim();
System.out.println(trim);

//Split
String r = "Welcome To Java Class";
String[]sp = r.split("a");
System.out.println(sp[0]);

//SubString
String rt ="Selenium";
String su = rt.substring(2);
System.out.println(su);

//Substring n-1
String pe ="Selenium2";
String ps = pe.substring(1,4);
System.out.println(ps);

// Compare to 
//ASCII American Standard Code for Information and Interchange

String p="A";
int to = p.compareTo("B");
System.out.println(to);


String pp="ABCDPF";
int com = pp.compareTo("ABCDEF");
System.out.println(com);


String ppp="ABCDF";
int coe = ppp.compareTo("ABCDEFG");
System.out.println(com);

























































	}

			
			
			
}
