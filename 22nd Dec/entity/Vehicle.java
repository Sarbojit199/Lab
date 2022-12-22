package com.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy =InheritanceType.JOINED)
public class Vehicle {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int vid;


private String fuel;

private String enginePower;

private int speed;

private String vtype;

private int price;

public int getVid() {
	return vid;
}

public void setVid(int vid) {
	this.vid = vid;
}

public String getFuel() {
	return fuel;
}

public void setFuel(String fuel) {
	this.fuel = fuel;
}

public String getEnginePower() {
	return enginePower;
}

public void setEnginePower(String enginePower) {
	this.enginePower = enginePower;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public String getVtype() {
	return vtype;
}

public void setVtype(String vtype) {
	this.vtype = vtype;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}
