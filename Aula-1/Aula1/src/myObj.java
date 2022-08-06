public class myObj {
     Integer num;


        public myObj(Integer nun) {
            this.num = nun;
        }

        public void setNun(Integer nun) {
            this.num = nun;
        }

        @Override
        public String toString() {
            return this.num.toString();
        }
}
