
import java.util.Random;

class Coin {

    private TossResult[] _results;

    public void Toss(int times) {

        // create an array of Tossing results
        // each element of the array will hold a TossResult instance (which will be
        // either Tail or Head)
        _results = new TossResult[times];

        // this is a built in java class that provides us with random numbers
        Random random = new Random();

        // generate 10 random booleans in each iteration of the loop
        // if the random boolean result is "true" then store a Head TossResult in the
        // results arrat
        // otherwise store a Tail TossResult in the results array
        int index = 0;
        while (index < times) {

            if (random.nextBoolean()) {
                _results[index] = new Head();
            } else {
                _results[index] = new Tail();
            }
            index++;
        }

    }

    public double GetProbabilityOfGetting(TossResult result) {

        // find out how many times we got a particular result
        // for example, if the TossResult is a Head, count the number of heads we got
        // out of the total number of tosses
        // remember that the results length array is the total number of tosses
        int index = 0, matches = 0;
        while (index < _results.length) {

            if (_results[index].GetValue() == result.GetValue()) {
                matches++;
            }

            index++;
        }

        // matches is an integer and so is the total number of tosses (_results.length)
        // I'm casting both to double so that I get a double result (else dividing an
        // int by another int will yield to precision loss)
        // and in this particular case we know the result of the division is less than 1
        // because matches is smaller than the total number of tosses. hence without
        // casting the result will be zero
        return (double) matches / (double) _results.length;
    }
}
