/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arr_2;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Tempature {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ngay : ");
        n = sc.nextInt();
        System.out.println("nhap nhiet do cua : " + n + " ngay ");
        int tong = 0;
        int a[] = new int[n];
        int i = 0;
        for( i = 0; i < n; i ++){
            a[i] = sc.nextInt();
            tong = tong + a[i];
        }
        float trungBinh = (float) tong/n;
        System.out.println("Trung binh nhiet do cua " + n + " ngay vua nhap la : " + trungBinh);
        
        int y = 0;
        if( a[i] > trungBinh) {
            y++;
        }  
     System.out.println("so ngay nhiet do tren tb :" + y);
              
    }

    
}
