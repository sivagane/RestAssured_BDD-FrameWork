package com.qa.restAssured.BDD.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
	int i = 10, j = 20;
}

public class RestAssuredSerializationAndDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Test t1 = new Test();

		//Serialization
		FileOutputStream fos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);

		// Deserialization

		FileInputStream fis = new FileInputStream("test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Test t2 = (Test) ois.readObject();// Typecasting ois.readObject and storing the value as Testtype in t2
		System.out.println(t2.i+" "+t2.j);
	}
}
