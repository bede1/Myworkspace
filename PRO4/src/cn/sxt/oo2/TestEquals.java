package cn.sxt.oo2;
/**
 * ≤‚ ‘==  ∫Õequal
 * @author pc
 *
 */
public class TestEquals {	
	public static void main(String[]args) {
		Object obj;
		String str;
		User u1 = new User(1000,"sherman","123");
		User u2 = new User(1000,"sherman","123");
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
	}

}
class User{
int id;
String name;
String pwd;
public User(int id, String name, String pwd) {
	super();
	this.id = id;
	this.name = name;
	this.pwd = pwd;

}
//equalsµƒ÷ÿ–¥
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pwd == null) {
		if (other.pwd != null)
			return false;
	} else if (!pwd.equals(other.pwd))
		return false;
	return true;
}
}

