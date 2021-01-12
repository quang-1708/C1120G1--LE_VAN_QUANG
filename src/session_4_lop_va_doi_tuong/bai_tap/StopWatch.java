package session_4_lop_va_doi_tuong.bai_tap;

import java.util.Date;

public class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch(){
            this.startTime = System.currentTimeMillis();
        }

        public long getEndTime() {
            return this.endTime;
        }

        public long getStartTime() {
            return this.startTime;
        }

        public long start() {
            return this.startTime = System.currentTimeMillis( );
        }

        public long stop() {
            return this.endTime = System.currentTimeMillis( );
        }
        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
        public static void main(String[] args) {
            Date starTime;
            Date endTime;
            int numberArray[] = new int[100000];
            for (int i = 0; i < numberArray.length ; i++) {
                numberArray[i] = (int) Math.floor((Math.random() * 100000));
            }
            StopWatch watch = new StopWatch();
            starTime = new Date();
            System.out.println("Time start run: " + starTime );
            watch.start();
            int indexMin, i, j;
            for (i = 0; i < numberArray.length - 1; i++) {
                indexMin = i;
                for (j = i + 1; j < numberArray.length; j++) {
                    if (numberArray[j] < numberArray[indexMin]) {
                        indexMin = j;
                    }
                }
                if (indexMin != i) {
                    int temp = numberArray[indexMin];
                    numberArray[indexMin] = numberArray[i];
                    numberArray[i] = temp;
                }
            }
            endTime = new Date();
            watch.stop();
            System.out.println(" Time end: " + endTime);
            System.out.println("Time run : " + watch.getElapsedTime());
        }
    }
