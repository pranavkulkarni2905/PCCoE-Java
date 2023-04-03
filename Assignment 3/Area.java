
public abstract class Area {
	abstract public float area();

}

class Rectangle extends Area{
	float length=10.1f,breadth=12.2f,ans;

	@Override
	public float area() {
		ans=length*breadth;
		return ans;
		
	}
	
	
}

class Triangle extends Area{
	float height=11.1f,base=7.1f,ans;

	@Override
	public float area() {
		ans=0.5f*height*base;
		return ans;
	}
	
}
class Square extends Area{
	float ans,side=22.2f;

	@Override
	public float area() {
		ans=side*side;
		return ans;
	}
	
}
