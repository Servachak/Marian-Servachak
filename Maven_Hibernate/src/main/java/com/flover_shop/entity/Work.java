package com.flover_shop.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.flower_shop.dao.CountryDao;
import com.flower_shop.dao.FlowerDao;

import DaoImplements.CountyDaoImplemrnt;
import DaoImplements.FlowerDaoImplement;

public class Work {

	public static Scanner scanner = new Scanner(System.in);
	public void start(){
EntityManagerFactory factory = Persistence.createEntityManagerFactory("Primary");
		
		
		EntityManager manager = factory.createEntityManager();
		
		boolean endAplication = false;
		while (!endAplication){
			System.out.println("Enter 1 to Add User"+"\nEnter 2 for add Flower"+"\nEnter 3 to add Country"+"\nEnter 4 to create a Order"+"\nEnter 5 to finish"+"\nEnter 6 to find flower"
					+"\nEnter 7 to add flower to country");
			String choise = scanner.next();
			
			switch (choise){
			
			case "1":{
				manager.getTransaction().begin();
				System.out.println("Enter User name");
				String userName = Work.scanner.next();
				
				System.out.println("Enter User age");
				int userAge = Work.scanner.nextInt();
				
				System.out.println("Enter sex this User");
				String sex = Work.scanner.next();
				
				System.out.println("Enter email");
				String email = Work.scanner.next();
				manager.persist(new User(userName, userAge, sex, email));
				
				manager.getTransaction().commit();
				
				break;
			}
			case "2":{
				manager.getTransaction().begin();
				System.out.println("Enter Flower name");
				String nameFlower = Work.scanner.next();
				
				System.out.println("Enter Flower color");
				String color = Work.scanner.next();
				
				System.out.println("Enter Flower price");
				int price = Work.scanner.nextInt();
				
				 manager.persist(new Flower(nameFlower, color, price));
						manager.getTransaction().commit();
				break;
			}
			case "3":{
				manager.getTransaction().begin();
				System.out.println("Enter Country");
				String nameCountry = Work.scanner.next(); 
				manager.persist(new Country(nameCountry));
				manager.getTransaction().commit();
				break;
			}
			case "4":{
				manager.getTransaction().begin();
//				manager.persist(new Orders(date));
				manager.getTransaction().commit();
				break;
			}
			case"5":{
				endAplication = true;
				break;
			}
			case "6":{
				FlowerDao flowerDao = new FlowerDaoImplement(manager);
				System.out.println("Enter Flower name");
				String name = Work.scanner.next();
				Flower flower = flowerDao.findOne(name);
				break;
			}
			case "7":{
				FlowerDao flowerDao = new FlowerDaoImplement(manager);
				CountryDao countryDao = new CountyDaoImplemrnt(manager);
				System.out.println("Enter Flower name");
				String name = Work.scanner.next();
				Flower flower = flowerDao.findOne(name);
				System.out.println("Enter Country");
				String countryName = Work.scanner.next();
				Country country = countryDao.fineOne(countryName);
				countryDao.addFlowerToCountry(flower, country);
				break;
			}
			default :{
				System.out.println("Input is wrong");
			}
			}
		}
		manager.close();
		factory.close();
	}
}
