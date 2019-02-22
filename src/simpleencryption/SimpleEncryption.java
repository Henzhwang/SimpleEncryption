/*
 * @Henry Huang
 * SimpleEncryption.java
 * Feb 21,2019
 * This program is designed to encrypt or decrypt a phrase into teh ciphertext.
 */
package simpleencryption;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String phrase = JOptionPane.showInputDialog("This program will encrypt or"
                + " decrypt a phrase using the simple encryption method of rotating "
                + "the letters." + "\n\nPlease enter a phrase:");
        
        String option = JOptionPane.showInputDialog("Please choose a mthod:" +
                "\n1.Encryption \n2.Decryption");
         
        String rotation = JOptionPane.showInputDialog("Enter the rotation amount"
                + "(1-25)");
        
       char[] chart = phrase.toCharArray();
       
       int shift = Integer.parseInt(rotation);
       
       System.out.println(shift);
       
       String code = "";
       
       
       
       
       //System.out.println(chart);
        

        
        if (shift <= 25 && shift >= 1 )
        {
           if (option.equals("1") )
           {
               for (int i = 0; i < phrase.length(); i ++)
                    {
                        char ch = phrase.charAt(i);
                        //System.out.println(ch);
                        if (ch!= ' ')
                            {
                                int n =1;
                                ch = (char) ((char) ch + shift);
                                //ch =(char)((ch - 'A' + 1) % 26 + 'A');
                                System.out.println(ch);
                                
                                
                                for (int position = phrase.length() - 1; position >= 0; position --)
                                    {
                                        code += phrase.charAt(position);
                                        System.out.println(code);
                                    }
                                
                                
                            }
                        
                    }
            
                //System.out.println(chart[i]);
            }
           else if (option.equals("2"))
           {
               for (int i = 0; i < phrase.length(); i ++)
                    {
                       char ch = phrase.charAt(i);
           
                        //System.out.println(ch);
                        if (ch!= ' ')
                            {
                                int n =1;
                                ch = (char) ((char) ch - shift);
                                //ch =(char)((ch - 'A' + 1) % 26 + 'A');
                                 System.out.println(ch);
                                  for (int position = phrase.length() - 1; position >= 0; position --)
                                    {
                                        code += phrase.charAt(position);
                                    }
                            }
                    }
            }
        if(shift > 25 && shift < 1 )
            {
                JOptionPane.showMessageDialog(null,"Please enter an vaild number!");
            }
        
        }
        
        //String code = String.valueOf(ch);
        
        //System.out.println(code);
        
    }
}
    

