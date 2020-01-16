import java.util.Scanner;

public class Main {
    Data data = new Data();
    Scanner scanner = new Scanner(System.in);
    String x="";
    String[] table = new String[x.length()];
    String answer = "";
    public void start(){
        System.out.println("Enter the number:");
        x=scanner.next();
        table = x.split("");
        if(table.length == 1){
            one();
        }
        else if(table.length==2){
            two();
            one();
        }
        else if(table.length==3){
            three();
            two();
            one();
        }
        else if(table.length==4){
            four();
            three();
            two();
            one();
        }
        else{
            System.out.println("Unexpected number. Try again");
        }
        data.setResoult(answer);
        answer="";
        System.out.println(data.getResoult());
    }
    public void one(){

        if(Integer.parseInt(table[table.length-1])==1){
            answer+="I";
        }
        else if(Integer.parseInt(table[table.length-1])==2){
            answer+="II";
        }
        else if(Integer.parseInt(table[table.length-1])==3){
            answer+="III";
        }
        else if(Integer.parseInt(table[table.length-1])==4){
            answer+="IV";
        }
        else if(Integer.parseInt(table[table.length-1])==5){
            answer+="V";
        }
        else if(Integer.parseInt(table[table.length-1])==6){
            answer+="VI";
        }
        else if(Integer.parseInt(table[table.length-1])==7){
            answer+="VII";
        }
        else if(Integer.parseInt(table[table.length-1])==8){
            answer+="VIII";
        }
        else if(Integer.parseInt(table[table.length-1])==9){
            answer+="IX";
        }
        else{answer+="";}
    }
    public void two(){
        if(Integer.parseInt(table[table.length-2])==1){
            answer+="X";
        }
        else if(Integer.parseInt(table[table.length-2])==2){
            answer+="XX";
        }
        else if(Integer.parseInt(table[table.length-2])==3){
            answer+="XXX";
        }
        else if(Integer.parseInt(table[table.length-2])==4){
            answer+="XL";
        }
        else if(Integer.parseInt(table[table.length-2])==5){
            answer+="L";
        }
        else if(Integer.parseInt(table[table.length-2])==6){
            answer+="LX";
        }
        else if(Integer.parseInt(table[table.length-2])==7){
            answer+="LXX";
        }
        else if(Integer.parseInt(table[table.length-2])==8){
            answer+="LXXX";
        }
        else if(Integer.parseInt(table[table.length-2])==9){
            answer+="XC";
        }
        else{answer+="";}
    }
    public void three(){
        if(Integer.parseInt(table[table.length-3])==1){
            answer+="C";
        }
        else if(Integer.parseInt(table[table.length-3])==2){
            answer+="CC";
        }
        else if(Integer.parseInt(table[table.length-3])==3){
            answer+="CCC";
        }
        else if(Integer.parseInt(table[table.length-3])==4){
            answer+="CD";
        }
        else if(Integer.parseInt(table[table.length-3])==5){
            answer+="D";
        }
        else if(Integer.parseInt(table[table.length-3])==6){
            answer+="DC";
        }
        else if(Integer.parseInt(table[table.length-3])==7){
            answer+="DCC";
        }
        else if(Integer.parseInt(table[table.length-3])==8){
            answer+="DCCC";
        }
        else if(Integer.parseInt(table[table.length-3])==9){
            answer+="CM";
        }
        else{answer+="";}
    }
    public void four(){
        if(Integer.parseInt(table[table.length-4])==1){
            answer+="M";
        }
        else if(Integer.parseInt(table[table.length-4])==2){
            answer+="MM";
        }
        else if(Integer.parseInt(table[table.length-4])==3){
            answer += "MMM";
        }
        else{answer+="";}
    }
    public void options(){
        System.out.println("1. Again, that's fun!");
        System.out.println("2. Leave me alone!");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            do {
                main.start();
                main.options();
                a = sc.nextInt();
            } while (a == 1);
        }while(a!=2);

    }
}