package cc;

import java.util.LinkedList;

class Animal{
	String name;
	int order;
	
	Animal(String n){
		name = n;
	}
	
	void setOrder(int o){
		order = o;
	}
	
	int getOrder(){
		return order;
	}
	
	boolean younger(Animal a){
		if(this.order < a.order)
			return true;
		else
			return false;
	}
}

class Dog extends Animal{
	Dog(String n){
		super(n);
	}
}

class Cat extends Animal{
	Cat(String n){
		super(n);
	}
}

public class cc3o7 {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	int order;
	
	void enqueue(Animal anm){
		order++;
		if(anm instanceof Dog){
			dogs.add((Dog)anm);
		}
		else{
			cats.add((Cat)anm);
		}
		anm.setOrder(order);
	}
	
	Animal dequeueAny(){
		if(dogs.isEmpty()){
			return dequeueCat();
		}
		else if(cats.isEmpty()){
			return dequeueDog();
		}
		else if(dogs.get(0).younger(cats.get(0))){
			Dog d = dogs.removeFirst();
			return d;
		}
		else{
			Cat c = cats.removeFirst();
			return c;
		}
	}
	
	Dog dequeueDog(){
		if(!dogs.isEmpty()){
			Dog d = dogs.removeFirst();
			return d;
		}
		else 
			return null;
	}
	
	Cat dequeueCat(){
		if(!cats.isEmpty()){
			Cat c = cats.removeFirst();
			return c;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc3o7 c = new cc3o7();
		Dog d1 = new Dog("d1");
		Dog d2 = new Dog("d2");
		Dog d3 = new Dog("d3");
		
		Cat c1 = new Cat("c1");
		Cat c2 = new Cat("c2");
		Cat c3 = new Cat("c3");
		
		c.enqueue(d1);
		c.enqueue(c1);
		c.enqueue(d2);
		c.enqueue(d3);
		c.enqueue(c2);
		c.enqueue(c3);
		
		System.out.println(c.dequeueAny().name);
		
		System.out.println(c.dequeueDog().name);
		
		System.out.println(c.dequeueCat().name);
		
		System.out.println();
		
		for(Animal a : c.dogs){
			System.out.print(a.name + "\t");
		}

		System.out.println();
		
		for(Animal a : c.cats){
			System.out.print(a.name + "\t");
		}
	}

}
