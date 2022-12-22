package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.dao.Dao;
import com.demo.entities.FourWheels;
import com.demo.entities.TwoWheels;
import com.demo.entities.Vehicle;

public class DaoImpl implements Dao{
public void addVehicle() {
	Session session =HibernateUtil.activateSession();
	Transaction tx= session.beginTransaction();
	Vehicle v=new Vehicle();
	TwoWheels tw=new TwoWheels();
	v.setFuel("petrol");
	v.setEnginePower("500cc");
	v.setSpeed(200);
	v.setVtype("bike");
	v.setPrice(2000);
	
session.save(v);
	tw.setModelno(1234);
	tw.setModelname("abc");
	tw.setAbs(true);
	tw.setTyretype(140);
	tw.setBtype("sports bike");
	session.save(tw);

	FourWheels fw= new FourWheels();
	fw.setFuel("electric");
	fw.setEnginePower("100cc");
	fw.setSpeed(400);
	fw.setVtype("car");
	fw.setPrice(8000);
	fw.setModelno(12345);
	fw.setModelname("swift");
	fw.setMusicSystem(true);
	fw.setEtype("auto");
	fw.setAc(true);
	session.save(fw);
	tx.commit();
	session.close();
}
}
