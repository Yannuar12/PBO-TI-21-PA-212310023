package com.latihan;

import java.util.Scanner;

public class Latihan09 {
	
	public static void main(String[] args) {
		Latihan09 myProgram = new Latihan09();

        System.out.println("===SELAMAT DATANG==== \n");
        System.out.println("===SILAHKAN ISI DATA DIRI ANDA===\n");
        
        myProgram.InputStudents();
    }

	private void InputStudents() {
		// TODO Auto-generated method stub
		
	}

	int NPM;
    String FullName;
    String ClassName;
    int Semester;
    float GPA;

    int getNPM(int val) {
        NPM = val;
        return NPM;
    }

    String getFullName(String val) {
        FullName = val;
        return FullName;
    }

    String getClassName(String val) {
        ClassName = val;
        return ClassName;
    }

    int getSemester(int val) {
        Semester = val;
        return Semester;
    }

    float getGPA(float val) {
        GPA = val;
        return GPA;
    }
        
        System.out.print("Masukkan nama lengkap Anda = ");
        inFullName = valueInput.nextLine();
        objFullName = myBio.getFullname(inFullName);

        System.out.print("Masukkan kelas Anda = ");
        inClassName = valueInput.nextLine();
        objClassName = myBio.getClassName(inClassName);

        System.out.print("Masukkan semester Anda = ");
        inSemester = valueInput.nextInt();
        objSemester = myBio.getSemester(inSemester);

        System.out.print("Masukkan GPA / IPK Anda = ");
        inGPA = valueInput.nextFloat();
        objGPA = myBio.getGPA(inGPA);

        OutputStudents(objNPM, objFullName, objClassName, objSemester, objGPA);

        valueInput.close();
    }

    void OutputStudents(int val_NPM, String val_FullName, String val_ClassName, int val_Semester, float val_GPA) {
    	System.out.print("\n");
    	
        System.out.println("NPM            : " + val_NPM);
        System.out.println("Nama Lengkap   : " + val_FullName);
        System.out.println("Kelas          : " + val_ClassName);
        System.out.println("Semester       : " + val_Semester);
        System.out.println("GPA / IPK      : " + val_GPA);
    }

}