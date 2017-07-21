/**
 * Created by TACasey-Calhoun on 7/20/2017.
 */
public class Car {

        private String make;
        private String model;
        private int year;
        private double price;

        public Car () {
            make = "";
            model = "";
            year = 0;
            price = 0.0;
        }

        public Car (String ma, String mo, int y, double p) {
            make = ma;
            model = mo;
            year = y;
            price = p;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public void setMake(String ma) {
            make = ma;
        }

        public void setModel(String mo) {
            model = mo;
        }

        public void setYear(int y) {
            year = y;
        }

        public void setPrice(double p) {
            price = p;
        }

    }

