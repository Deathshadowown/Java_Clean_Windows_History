/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: svan-nie <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/10/23 04:16:30 by svan-nie          #+#    #+#             */
/*   Updated: 2020/10/23 04:16:30 by svan-nie         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src;

import java.io.File;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try {
            
            Scanner scan = new Scanner(System.in);
            String userName = null;
            File tempRemove = new File("/mnt/c/Users/"+userName+"/AppData/Local/Temp");
            File startMenuRemove = new File ("/mnt/c/ProgramData/Microsoft/Windows/Start Menu/Programs");
            while(true){
                System.out.print("Please enter your computer userName: ");
                userName = scan.nextLine();
                tempRemove = new File("/mnt/c/Users/"+userName+"/AppData/Local/Temp");
                Boolean exist = tempRemove.exists();
                if (exist){
                    break ;
                }
            }
            int tempRemoveCount = tempRemove.list().length;
            tempRemoveCount--;
            String tempRemoveList[] = tempRemove.list();
            int count = 0;
            while (count <= tempRemoveCount){
                File tempFileToRemove = new File(tempRemove+"/"+tempRemoveList[count]);
                tempFileToRemove.delete();
                count++;
            }
            count = 0;
            int startMenuCount = startMenuRemove.list().length;
            startMenuCount--;
            String startMenuList[] = startMenuRemove.list();
            while (count <= startMenuCount){
                File deleteStartMenuList = new File(startMenuRemove+"/"+startMenuList[count]);
                deleteStartMenuList.delete();
                count++;
            }
            System.out.println("Your Temp and start menu have been cleaned.");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR:");
        }
        }
    }