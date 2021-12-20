package org.example.service;

public class Calcul implements ICalcul{

    @Override
    public int ppcm(int a,int b)
    {
        int p=a*b;
        while (a!=b)
            if (a<b)
                b-=a;
            else
                a-=b;
        return p/a;
    }
}
