import java.io.FileReader;
import java.io.BufferedReader;

import weka.core.Instances;
import weka.clusterers.EM;

public class BasketballWekaClusteringAlgorithm {
	public static void main(String args[]) throws Exception{
	    // Read the file
		FileReader fileReader = new FileReader("data/datasets-numeric-baskball.arff");
		BufferedReader bufferReader =  new BufferedReader(fileReader);
		
		//load data as Weka Instances
		Instances data = new Instances(bufferReader);
	    
		// Create an instance of clusterer, as a simple EM (expectation maximisation) instance
	    EM model = new EM();
		
	    // build the Weka clusterer
	    model.buildClusterer(data);
		
		// Print the pattern model
	    System.out.println(model);
	  }
}
