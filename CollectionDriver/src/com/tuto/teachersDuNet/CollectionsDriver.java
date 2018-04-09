package com.tuto.teachersDuNet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by matthieu.bailly on 30/03/2018.
 */
public class CollectionsDriver {

    public static void main(String [] args){
        File file = new File("CollectionDriver/ressources/musiques.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line = bufferedReader.readLine();
        } catch(FileNotFoundException e) {
            System.err.println("Fichier non trouvé");
        }


    }

    public String getStringFromFile( String path ) throws Exception {
		/*----------NE MODIFIEZ PAS LE CODE AU DESSUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/
        File file = new File(path);
        String line = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)){
            while ((line = bufferedReader.readline()) != null) {
                line = line.append(bufferedReader.readline());
                line.nextLine();
            }

        }catch(FileNotFoundException e) {
            System.err.println("Fichier non trouvé");
        }
        /**** Entrez votre code ici ****/

		/*----------NE MODIFIEZ PAS LE CODE EN DESSOUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/
    }
}
