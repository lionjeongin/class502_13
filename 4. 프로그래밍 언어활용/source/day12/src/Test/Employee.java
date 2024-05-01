package Test;

public class Employee {
    public String name;
    public String name;
    public Employee(String name) {
        this.name = name
    }
}
public class Engineer extends Employee {
    private String skillset;
    public String getSkillset() {
        return skillset;
    }
    public void setSkillSet(String skillSet)
        this.skillSet = skillset;
}

/*
상위 클래스 (Employee)에 디폴트 생성자가 없으므로 하위 클래스(Engineer)에서 생성자를 정리하고
super()를 사용하여 상위 클래스의 생성자를 명시적으로 호출해야 합니다.
 */