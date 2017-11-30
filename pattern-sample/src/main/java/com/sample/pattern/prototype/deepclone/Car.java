package com.sample.pattern.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Car implements Serializable{
	private String name;
	private List<Wheel> wheels = new ArrayList<Wheel>();
	private List<Chair> chairs = new ArrayList<Chair>();;
	
	public Car() {
		super();
	}
	public Car(String name, List<Wheel> wheels, List<Chair> chairs) {
		super();
		this.name = name;
		this.wheels = wheels;
		this.chairs = chairs;
	}
	
	public void addWheel(Wheel wheel) {
		this.wheels.add(wheel);
	}
	
	public void addChair(Chair chair) {
		this.chairs.add(chair);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Wheel> getWheels() {
		return wheels;
	}
	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	public List<Chair> getChairs() {
		return chairs;
	}
	public void setChairs(List<Chair> chairs) {
		this.chairs = chairs;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("car name : ").append(name).append("\n");
		for(int i=0; i<chairs.size(); i++) {
			sb.append("chair " + (i+1) + " color : ").append(chairs.get(i).getColor()).append("\n");
		}
		for(int i=0; i<wheels.size(); i++) {
			sb.append("wheel " + (i+1) + " size : ").append(wheels.get(i).getSize()).append("\n");
		}
		return sb.toString();
	}
	
	public Object deepClone() throws Exception
    {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}
