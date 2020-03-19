
public class App {
        public static void main(String[] args) {
                Coin();
        }

        private static void Coin() {

                Coin coin = new Coin();

                //toss a coin ten times
                coin.Toss(5);
                
                //how many times did we get heads out of the ten times?
                //for example if we got 4 heads out of 10, percentageOfHeads is going to be 0.4
                double percentageOfHeads = coin.GetProbabilityOfGetting(new Head());
                System.out.println("After 10 tosses: " + String.format("%.10f", percentageOfHeads - 0.5));

                //repeat with more tosses
                coin.Toss(10);
                percentageOfHeads = coin.GetProbabilityOfGetting(new Head());
                System.out.println("After 10 tosses: " + String.format("%.10f", percentageOfHeads - 0.5));

                //repeat with more tosses
                coin.Toss(15);
                percentageOfHeads = coin.GetProbabilityOfGetting(new Head());
                System.out.println("After 15 tosses: " + String.format("%.10f", percentageOfHeads - 0.5));

                //repeat with more tosses
                coin.Toss(40);
                percentageOfHeads = coin.GetProbabilityOfGetting(new Head());
                System.out.println("After 40 tosses: " + String.format("%.10f", percentageOfHeads - 0.5));

                 //repeat with more tosses
                 coin.Toss(100);
                 percentageOfHeads = coin.GetProbabilityOfGetting(new Head());
                 System.out.println("After 100 tosses: " + String.format("%.10f", percentageOfHeads - 0.5));
        }

}
