/*class Person*/
package tp3exosYaip4.n2;

public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
    

        public static void main(String[] args) {
        		Person P = new Person("Hamine","Amza");	
        		System.out.println(P.getAddress());
        		System.out.println(P.getAddress());	
        }
    }



