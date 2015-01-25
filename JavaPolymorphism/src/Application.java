
public class Application
    {
    public static void main(String[] args)
        {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        // this just references to plant 1 or tree depending on which it is == to
        Plant plant2 = tree;

        plant2.grow();

        tree.sharedLeaves();

        //this will not work as it is a plant that is made
        //plant2.shedLeaves();
        doGrow(tree);
        }

    public static void doGrow(Plant plant)
        {
        plant.grow();
        }
    }
