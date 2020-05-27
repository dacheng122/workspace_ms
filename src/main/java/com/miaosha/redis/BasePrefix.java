package com.miaosha.redis;

/**
 *1.重载overload:重载发生在一个类中，同名的方法如果有不同的参数列表（参数类型不同、参数个数不同或者二者都不同）则视为重载
 *  同时，重载对返回类型没有要求，可以相同也可以不同，但不能通过返回类型是否相同来判断重载。
 *2.重写override:重写发生在子类与父类之间，重写要求子类被重写方法与父类被重写方法有相同的方法名，参数列表，有兼容的返回类型，
 *  比父类被重写方法更好访问，不能比父类被重写方法声明更多的异常（里氏代换原则）
 */
public abstract class BasePrefix implements KeyPrefix{
	
	private int expireSeconds;
	private String prefix;
	
	public BasePrefix(String prefix) {//0代表永不过期
		this(0, prefix);
	}
	//构造函数 多个构造函数存在于类中，是以重载Overload的形式体现的。因为构造函数的名称都相同
	public BasePrefix( int expireSeconds, String prefix) {
		this.expireSeconds = expireSeconds;
		this.prefix = prefix;
	}
	
	public int expireSeconds() {//默认0代表永不过期
		return expireSeconds;
	}

	public String getPrefix() {
		String className = getClass().getSimpleName();
		return className+":" + prefix;
	}

}
