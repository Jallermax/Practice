package jallermax.rememberme;
import java.io.IOException;
import java.lang.reflect.Field; //for className
import java.util.Scanner;
import java.util.Locale;

class rememberme {
	public static void main (String[] args){
		System.out.println("Choose function:");
		System.out.println("1 - output");
		System.out.println("2 - ClassNaming");
		System.out.println("3 - ASCii table");
		System.out.println("4 - Determinate ASCii code of symbol(s)");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int ChoosenFunction = sc.nextInt(); //Getting number of desired fuction
			switch (ChoosenFunction) {
				case 1: Output.string();
						break;
				case 2: ClassNaming t = new ClassNaming();
						t.getClassName();
						t.getAttributes();
						break;
				case 3: ASCII.table();
						break;
				case 4: ASCII.determinate();
						break;
						
				default: System.out.println("Invalid number");
						break;
			}
        } else {
          System.out.println("Wrong choise! Input number of desired function");
        }		
		
		
	}
}

class Output{
	public static void string(){
		System.out.print("\"Finally ok!\" ");
		System.out.println("\u0040");
		
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}
}

 class ClassNaming {

    int x;
    int y;  

    public void getClassName(){
        String className = this.getClass().getSimpleName(); 
        System.out.println("Name:"+className);
    }

    public void getAttributes(){
		Field[] Attributes = this.getClass().getDeclaredFields();   
        for(int i=0;i<Attributes.length;i++){
            System.out.println("Declared Fields"+Attributes[i]);    
        }

    }
}

class ASCII {
	public static void table(){
		//table_of_symbols 0-63 64-127 128-191 192-255
		char symbol = 0;
		for (int i = 0; i<64; i++, symbol++){
			//System.out.print("\r                                                            "+(i+192)+" - "+"\""+(char)(i+192)+"\""); 
			//System.out.print("\r                                        "+(i+128)+" - "+"\""+(char)(i+128)+"\"");
			System.out.print("\r                    "+(i+64)+" - "+"\""+(char)(i+64)+"\"");
			System.out.print("\r"+i+" - "+"\""+(char)i+"\"");
			System.out.println();
		}
	}
	
	public static void determinate(){
		Scanner scd = new Scanner(System.in);
		String symbol = scd.nextLine();
		int numch = 0;
		for (char chch : symbol.toCharArray()) { //"for each" cycle
			numch++;
			System.out.println("ASCii code "+numch+" of symbol \""+chch+"\" is:"+(byte)chch+"  ");
		}
	}
}
