public class Runner {
    public static void main(String[] args){
        String[][] face = new String[10][15];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("0");
        face1.edit(" ", 0, 0);
        face1.edit(" ", 0, 1);
        face1.edit(" ", 0, 2);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 4);
        face1.edit(" ", 0, 5);
        face1.edit(" ", 0, 6);
        face1.edit(" ", 0, 7);
        face1.edit(" ", 0, 13);
        face1.edit(" ", 0, 14);
        face1.edit(" ", 1, 0);
        face1.edit(" ", 1, 1);
        face1.edit(" ", 1, 2);
        face1.edit(" ", 1, 3);
        face1.edit(" ", 1, 4);
        face1.edit(" ", 1, 5);
        face1.edit(" ", 1, 6);
        face1.edit(" ", 1, 14);
        face1.edit(" ", 2, 0);
        face1.edit(" ", 2, 1);
        face1.edit(" ", 2, 2);
        face1.edit(" ", 2, 3);
        face1.edit(" ", 2, 4);
        face1.edit(" ", 2, 5);
        face1.edit(" ", 2, 6);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);
        face1.edit(" ", 0, 3);



        System.out.println(face1);
    }
}
