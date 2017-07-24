package edu.kb;

public class Point3D<T> {
	T x;
	T y;
	T z;
	
	Point3D(T x, T y, T z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "[ " + x + ", " + y + ", " + z + " ]";
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if(obj instanceof Point3D)
			return ((Point3D<T>)obj).x == x && 
				   ((Point3D<T>)obj).z == z && 
				   ((Point3D<T>)obj).z == z;
		else 
			return false;
	}
}