import logicboard.LogicBoard;
import logicboard.boardbuilder.BoardTreeBuilder;

/**
 * Created by CptAmerica on 7/2/15.
 */
public class exprsDriver {

    public static void main(String[] args){

        String expression = "( A * B ) + ( A * B ) ";
        String expression1 = "A + B";

        String[] inputs = {"A", "B"};
        BoardTreeBuilder builder = new BoardTreeBuilder();

        LogicBoard xor = builder.buildTree(expression, inputs, "XOR");

        xor.printGates();



    }

}
