package exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) {


//         그냥 Exception test
        try {
        int a =3/0;
        System.out.println(a);
        }
        catch(Exception e) {
            System.out.println("예외처리 됨");
        }

        // case : 부모가 자식 것을 받을 수 있나 -> 가능
        try {
            throw new FileNotFoundException();
        }
        catch(IOException e){
            System.out.println("IOException");
        }


        //case : 자식이 부모의 것을 받을 수 있나 -> 아예 throw가 안됨
//        try {
//            throw new IOException();
//        }
//        catch(FileNotFoundException e){
//            System.out.println("FileNotFoundException");
//        }

    }
    }
