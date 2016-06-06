package jallermax.examples;


public class Brick{
	public static int COUNTER=0;
	private String color;
	private float lenght;
	private float height;
	private float width;
	private int holes_num;
	
	Brick(){
		COUNTER++;
		this.setColor("Red");
		this.setLenght(21);
		this.setHeight(10);
		this.setWidth(8);
		this.setHoles_num(8);
	}
	
	Brick(String c, float l, float h, float w, int hn){
		COUNTER++;
		this.setColor(c);
		this.setLenght(l);
		this.setHeight(h);
		this.setWidth(w);
		this.setHoles_num(hn);
	}
	
	Brick(String type){ // TODO case type = random randomize all variables
		COUNTER++;
		this.setColor("1");
		this.setLenght(1);
		this.setHeight(1);
		this.setWidth(1);
		this.setHoles_num(1);
	}
	
	//Getters
	public String getColor(){
		return color;
	}
	public float getLenght(){
		return lenght;
	}
	public float getHeight(){
		return height;
	}
	public float getWidth(){
		return width;
	}
	public int getHoles_num(){
		return holes_num;
	}
	
	//Setters
	public void setColor(String c){
		this.color=c;
	}
	public void setLenght(float l){
		this.lenght=l;
	}
	public void setHeight(float h){
		this.height=h;
	}
	public void setWidth(float w){
		this.width=w;
	}
	public void setHoles_num(int hn){
		this.holes_num=hn;
	}
}

public class Examples{
	public static void main(String[] args){
		Brick[] b = new Brick[5]; //swap to massive of Bricks
		for (int i=0; i<5; i++){
			b[i] = new Brick("pink", 23, 11, 5, 6); //add random properties for constructor
			System.out.println(b[i].getColor()+" brick with dimensions "+b[i].getLenght()+"x"+b[i].getHeight()+"x"+b[i].getWidth()+" and "+b[i].getHoles_num()+" holes");
		}
		System.out.println("\nCreated "+Brick.COUNTER+" bricks");
	}
} 