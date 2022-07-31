import java.util.Scanner;
class Income
{
	public static void main(String args[])
    {
        int R=0;

        while (R==0)
        {
            /*Get Filing Type and store into Var FT */
            double type=0, ft;
            Scanner sc=new Scanner(System.in);
            System.out.println("What are we filing as? 0: Single, 1: Joint/Widow(er) 2: Married Filing Separately 3: Head of Household");
            ft=sc.nextDouble();
    
            /*Get Income Tax and store to Var it */
            double tax=0, it;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter Income");
            it=t.nextDouble();
    
            /* Calcuate Income Tax based on inputs */
    
            if(ft==0)
            {
                if (it<=8350)
                 tax=0.1*(it);
                else if (it<=33950)
                 tax=(0.15*(it-8350))+(8350*0.1);
                else if (it<=82250)
                 tax=(0.25*(it-33950))+(25600*0.15)+(8350*0.1);
                else if (it<=171550)
                 tax=(0.28*(it-82250))+(48300*0.25)+(25600*0.15)+(8350*0.1);
                else if (it<=372950)
                 tax=(0.33*(it-171550))+(89300*0.28)+(48300*0.25)+(25600*0.15)+(8350*0.1);
                else if (it>=372951)
                 tax=(0.35*(it-372950))+(201400*0.33)+(89300*0.28)+(48300*0.25)+(25600*0.15)+(8350*0.1);
                System.out.println("Filed as single");
                System.out.println("Total income tax " +tax);
            }
            
            else if (ft==1)
            {
                if (it<=16700)
                 tax=0.1*(it);
                else if (it<=67900)
                 tax=(0.15*(it-16700))+(16700*0.1);
                else if (it<=137050)
                 tax=(0.25*(it-67900))+(51200*0.15)+(16700*0.1);
                else if (it<=208850)
                 tax=(0.28*(it-137050))+(69150*0.25)+(51200*0.15)+(16700*0.1);
                else if (it<=372950)
                 tax=(0.33*(it-208850))+(71800*0.28)+(69150*0.25)+(51200*0.15)+(16700*0.1);
                else if (it>=372951)
                 tax=(0.35*(it-372950))+(164100*0.33)+(71800*0.28)+(69150*0.25)+(51200*0.15)+(16700*0.1);
                System.out.println("Filed as Joint/Widow(er)");
                System.out.println("Total income tax " +tax);
            }
            else if (ft==2)
            {
                if (it<=8350)
                 tax=0.1*(it);
                else if (it<=33950)
                 tax=(0.15*(it-8350))+(8350*0.1);
                else if (it<=68525)
                 tax=(0.25*(it-33950))+(25600*0.15)+(8350*0.1);
                else if (it<=104425)
                 tax=(0.28*(it-68525))+(34575*0.25)+(25600*0.15)+(8350*0.1);
                else if (it<=186475)
                 tax=(0.33*(it-104425))+(35900*0.28)+(34575*0.25)+(25600*0.15)+(8350*0.1);
                else if (it>=186476)
                 tax=(0.35*(it-186475))+(82050*0.33)+(35900*0.28)+(34575*0.25)+(25600*0.15)+(8350*0.1);
                System.out.println("Filed as Married Filing Separately");
                System.out.println("Total income tax " +tax);
                
            }
            else if (ft==3)
            {
                if (it<=11950)
                 tax=0.1*(it);
                else if (it<=45500)
                 tax=(0.15*(it-11950))+(11950*0.1);
                else if (it<=117450)
                 tax=(0.25*(it-45500))+(33550*0.15)+(11950*0.1);
                else if (it<=190200)
                 tax=(0.28*(it-117450))+(71950*0.25)+(33550*0.15)+(11950*0.1);
                else if (it<=372950)
                 tax=(0.33*(it-190200))+(72750*0.28)+(71950*0.25)+(33550*0.15)+(11950*0.1);
                else if (it>=372951)
                 tax=(0.35*(it-372960))+(182760*0.33)+(72750*0.28)+(71950*0.25)+(33550*0.15)+(11950*0.1);
                System.out.println("Filed as Head of Household");
                System.out.println("Total income tax " +tax);
            }
    
            double SetRepeats=0, Repeats;
            Scanner Re=new Scanner(System.in);
            System.out.println("Redo Calculations? 1: Yes 2:No");
            Repeats=Re.nextDouble();
    
            if (Repeats==1)
             R=0;
            else 
             R=1;
    
        }
       
       

    }

}