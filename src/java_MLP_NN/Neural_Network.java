package java_MLP_NN;


/**
 * Created by Sarah on 9/25/2017.
 *
 * GOALS with this version of the project:
 * -- flesh out architecture with pseudocode; THEN fill in with code, once complete
 * -- Use the simplest NN design possible. Save Java's object focus for a later version.
 * -- Get a neural network up and running, in Java.
 */
public class Neural_Network
{
    //Write it out in pseudocode...

    /*

    class variables.
    int inputs_numNodes;
    int hidden_numNodes;
    int outputs_numNodes;

    int[] inputs_rawValues;
    int[] hidden_rawValues;
    int[] outputs_rawValues;

    int[][] layer1_weightValues;
    int[][] layer2_weightValues;

    int[][] layer1_weightChanges;
    int[][] layer2_weightChanges;




     */


    /**
     * Constructor for Neural Network.
     *
     * Simplistic. Takes 3 variables: number of input nodes, number of hidden nodes, number of output nodes.
     */
    /*
    public Neural_Network(int numberInputs, int numberHidden, int numberOutput)
    {
    // set up all variables. Random values set for weights. Compare to neural network attempt #2.

    inputs_numNodes = numberInputs;
    hidden_numNodes = numberHidden;
    outputs_numNodes = numberOutput

    inputs_rawValues = new int[inputs_numNodes];
    hidden_rawValues = new int[hidden_numNodes];
    outputs_rawValues = new int[outputs_numNodes];

    layer1_weightValues = new int[inputs_numNodes][hidden_numNodes];
    layer2_weightValues = new int[hidden_numNodes][outputs_numNodes];

    // Because of lack of Python's ML libraries, will have to make functions for randomization of weights. CALL them here.
    //Call method to randomize weights.
    randomizeWeights(layer1_weightValues);
    randomizeWeights(layer2_weightValues);

    layer1_weightChanges = new int[inputs_numNodes][hidden_numNodes];
    layer2_weightChanges = new int[hidden_numNodes][outputs_numNodes];

    //Call a method to fill with 0s.





    }


     */



    /**
     * Feed forward function for Neural Network.
     *
     * Just puts values in, feeds them forward just like normal. Will call the activation function.
     */
    /*


     */


    /**
     * Backpropagation function for Neural Network.
     *
     * Starting with targets and the outputted, instance-remembered raw values for each node, adjusts weights.
     * Will call the activation function's derivative (input the raw values) and * the error.
     *
     * Then, will update weights. DOUBLE-CHECK this portion, it's the rockiest part concept-wise.
     *
     */
    /*



     */


    /**
     *
     */


    /**
     * Training function for the Neural Network.
     *
     * Will call both backpropagation and feed forward functions.
     *
     * Will probably overload this function. This will be simple, with a set N learning rate, etc.
     *
     */
    /*


     */







    /////////////////////////////// Helper Functions //////////////////////////////////


    /**
     * Leaky ReLu, the activation function. Used in feed forward.
     */
    /*


     */


    /**
     * Derivative of Leaky ReLu. Used in backpropagation.
     */
    /*

     */


    // Should there be a function to load the data, in the Neural Network?
    // Or, should it go in the tester class?


    /**
     * Function to randomize weights.
     *
     * @param doubleArr the 2D array of doubles that will hold the weight values
     */
    /*
    for (int i = 0; i < ....one dimension's width; i++)
    {

        for (int j = 0; j < ...other dimension's width; j++)
        {

        doubleArr[i][j] = Math.random() * ....some value; see randn() from Python...;

        }


    }

     */
    public void randomizeWeights(double[][] doubleArr)
    {

    }


    /**
     * Function to fill with 0s.
     *
     * @param doubleArr the 2D array of doubles that will hold the weight changes
     */
    /*
    for (int i = 0; i < ....one dimension's width; i++)
    {

        for (int j = 0; j < ...other dimension's width; j++)
        {

        doubleArr[i][j] = 0;

        }


    }


     */
    public void fillZeroesWeights(double[][] doubleArr)
    {


    }


}