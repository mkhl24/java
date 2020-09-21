package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while (count != 6) {
            System.out.println("Count is " + count);
            count++;
        }
//        System.out.println("****for loop******");
        // FOR loop below is not idential to the above while loop
//	    for(int i=1; i<7; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }


        System.out.println("*****another while loop******");

        count = 1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("count value is " + i);
        }
//        System.out.println("**** do while loop ******");
//        // do while ex at least once
//
////        count = 6;
////        do {
////            System.out.println("Count walue was " + count);
////            count++;
////
////            if (count > 100) {
////                break;
////            }
////
////        } while (count != 6);
//

        System.out.println("***even number challenge****");
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFount = 0;

        // start of while loop
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;  // returns to the star of the loop
            }              // not processint anu code below

            //evenNumbersFount++;
            System.out.println("Even number " + number);
            evenNumbersFount++;

            if (evenNumbersFount >= 5) {
                break;
            }
        }
        // end of while loop
        System.out.println("Total amount of even numbers found is " + evenNumbersFount);


        System.out.println("************continue and break*******");
        int iteration = 0;
        while (iteration < 15) {
            iteration++;

            if (iteration <= 5) {
                System.out.println("Skip at number " + iteration);
                continue;
            }

            System.out.println("number = " + iteration);

            if (iteration >= 10) {
                System.out.println("Break at number " + iteration);
                break;
            }
        }

    }

    // challenge method
    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
