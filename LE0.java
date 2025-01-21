public class JUET
{
    String name;
    Integer age;
    
    void setName(String text){
        this.name = text;
    }
    void setAge(Integer num){
        this.age = num;
    }
    Integer getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    
    public static void main(String[] args){
        System.out.println("hello");
        JUET obj = new JUET();
        obj.setName("kasturi");
        obj.setAge(21);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }

}
