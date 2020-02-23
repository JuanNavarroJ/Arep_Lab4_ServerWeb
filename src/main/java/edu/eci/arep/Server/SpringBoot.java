/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.Server;

import edu.eci.arep.annotations.Web;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Juan David
 */
public class SpringBoot implements Runnable {

    public void init() throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int port = getPort();
        System.out.println(port);
        while (true) {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(port);
            } catch (IOException e) {
                System.exit(1);
            }
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.exit(1);
            }
            PrintWriter out = new PrintWriter(
                    clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            String inputLine;
            inputLine = in.readLine();
            try {
                OutputStream outputSteam = clientSocket.getOutputStream();
                String[] listaURL = inputLine.split(" ");
                //System.out.println(listaURL.length + " Longitud URL");
                //System.out.println(listaURL[0] + " URL0");
                //System.out.println(listaURL[1]  + " URL1");
                //System.out.println(listaURL[2]  + " URL2");
                String[] get = listaURL[1].split("/");
                //System.out.println(get.length + " Longitud GET");
                //System.out.println(get[0] + " GET[0]");
                //System.out.println(get[1] + " GET[1]");
                //System.out.println(get[2] + " GET[2]");
                //System.out.println(listaURL[1].contains("/WebService/"));
                //System.out.println(listaURL[1].contains("/WebService"));
                //System.out.println(listaURL[1]);
                if (listaURL[1].contains("/WebService")) {
                    System.out.println("SI entre");
                    //System.out.println(handler.busque(listaURL[1]));
                    //System.out.println(get[1]);
                    Class<?> c = Class.forName("edu.eci.arep.WebService." + get[1]);
                    System.out.println(c + " CLASSS");
                    for (Method metodo : c.getMethods()) {
                        //System.out.println(metodo + " -----------------");
                        if (metodo.isAnnotationPresent(Web.class)) {
                            String[] ans = get[2].split("[, ?.@]+");
                            System.out.println(metodo.getName());
                            if (metodo.getName().equals(ans[1])) {
                                System.out.println("SIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
                                metodo.invoke(c, "/src/main/resources/" + get[2], clientSocket.getOutputStream());
                                System.out.println("Hice Invoque");
                                System.out.println(get[2]);
                            }
                            if (!in.ready()) {
                                break;
                            }
                        }
                    }
                }

            } catch (NullPointerException e) {
                out.print("No existe lo que pide que esta buscando");
            } catch (ClassNotFoundException ex) {
                out.print("No existe la clase que esta buscando");
            }
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
            System.out.println("SALIMOS");
        }
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
