
public class ThreePointTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a\\b\\c\\\"d\"");
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
		System.out.println("\"line one\"\n\\line\t\ttwo\\");
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\");
		System.out.println("\"\\\"\\\"\" \n\t\\\"\\\"\"\\\n\\\"\"\"\"\\");
		
		String word = "Birthday";
		System.out.println(word.toUpperCase());
		
		word = "it's my party";
		System.out.println(word.substring(0,4) + " a \"" + word.substring(8,13).toUpperCase() + "\"");
		
		word = "whose a whats it";
		System.out.println(word.substring(0,5).toUpperCase() + "\nis " + word.substring(8,12).toUpperCase());
		
		word = "Every Way The Wind Blows";
		System.out.println(word.substring(0,5).toLowerCase() + " " + word.substring(6,9).toUpperCase() + " " + word.substring(10,14).toLowerCase() + "\\" + word.substring(14,18).toUpperCase()+"\\ " + word.substring(19,24).toLowerCase() + " 4");
		
		word= "Peter Piper Picked A Peck Of Picked Peppers";
		System.out.println(word.substring(19,29).toLowerCase()+"pickled\t"+ word.substring(36,43).toLowerCase()+" "+ word.substring(0,11)+"\t"+ word.substring(12,18).toLowerCase() );
		
		word = "word has 4 letters";
		System.out.println("\"" + word.substring(9,10) + "\" " + word.substring(11,18) + " " + word.substring(5,8) + " " + "\"" +  word.substring(0,9).length() + "\" "  + word.substring(11,18) );
		
		word = "if SUBSTRING is used";
		System.out.println(word.substring(3,12).toLowerCase() + " " + word.substring(13,16) + word.substring(3,12).length());
		
		word = "Jim, Jacky, Johnny, Jill";
		System.out.println(word.substring(0,3).toLowerCase() + "\\3\n" + word.substring(5,10).toUpperCase() + "\\5\n" + word.substring(12,18).toLowerCase() +"\\6\n" + word.substring(20,24).toUpperCase() + "\\4");
		


	}

}
