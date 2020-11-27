package ru.mirea.exercise21and22.ex1;

public class Holding {

    TypesComplex[] ran = {TypesComplex.ADD, TypesComplex.SUB, TypesComplex.MUL, TypesComplex.DIV};

    public Complex getComplex(TypesComplex type)
    {
        switch (type)
        {
            case ADD:
                return new AddComplex();
            case SUB:
                return new SubComplex();
            case MUL:
                return new MulComplex();
            case DIV:
                return new DivComplex();
        }
        return null;
    }

    public Complex getRandomComplex()
    {
        return getComplex(ran[rnd()]);
    }

    public int rnd()
    {
        return (int)(Math.random()*3);
    }
}
