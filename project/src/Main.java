import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.classifiers.trees.J48;
import weka.core.converters.ArffLoader;
import weka.classifiers.bayes.NaiveBayesUpdateable;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("This is testing");

        ArffLoader loader = new ArffLoader();
        loader.setFile(new File("/home/nijatmursali/Desktop/WORK - AVATR/Weka-DataMining/dataset/yb2.arff"));
        Instances structure = loader.getStructure();
        structure.setClassIndex(structure.numAttributes() - 1);

        // train NaiveBayes
        NaiveBayesUpdateable nb = new NaiveBayesUpdateable();
        nb.buildClassifier(structure);
        Instance current;
        while ((current = loader.getNextInstance(structure)) != null)
            nb.updateClassifier(current);

        // output generated model
        System.out.println(nb);
    }
}

