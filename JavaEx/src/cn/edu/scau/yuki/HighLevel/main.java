package cn.edu.scau.yuki.HighLevel;

class Message<T>{
	private T content;
	public void setContent(T content) {
		this.content = content;
	}
	public T getContent() {
		return this.content;
	}
}
public class main {
	
	public static void fun(Message<?> temp) {
		System.out.println(temp.getContent());
	}
	
	public static void main(String[] args) throws Exception{
		Message<String> msg = new Message<String>();
		msg.setContent("www.mldn.cn");
		fun(msg);
	}
	

}
