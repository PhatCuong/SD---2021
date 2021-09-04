import Iterator.IteratorInterface;
import Repository.NameRepository;

public class Client {
    public static void main(String args[]){
        NameRepository nameRepository = new NameRepository();

        nameRepository.addName("Daniel");
        nameRepository.addName("Britta");
        nameRepository.addName("Alex");
        nameRepository.addName("Christine");

        //Print from left to right
        System.out.println("-----------Left to Right------------");
        for (IteratorInterface iter = nameRepository.getLeft2RightOrder(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

        //Print from right to left
        System.out.println("-----------Right to Left------------");
        for (IteratorInterface iter = nameRepository.getRight2LeftOrder(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

        //Print alphabet
        System.out.println("-----------Alphabet Order------------");
        for (IteratorInterface iter = nameRepository.getAlphabetOrder(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }

    }
}
