public class SetGet {

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setBreadth(1.34f);
        r1.setLength(2.34f);
        System.out.println(r1.getBreadth());
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

    }
    static class Rectangle {
        float length;
        float breadth;

        public float getArea(){
            float area = length *breadth;
            return area;
        }

        public float getPerimeter(){
            float perimeter = 2*(length + breadth);
            return perimeter;
        }

        public float getBreadth() {
            return breadth;
        }

        public void setBreadth(float breadth) {
            this.breadth = breadth;
        }

        public void setLength(float length) {
            this.length = length;
        }

        public float getLength() {
            return length;
        }
    }
}
