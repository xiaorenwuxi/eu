package com.youxuan.eu.service;

/**
 * 
 * @author 邹龙
 *
 * @param <E> 泛型
 */
public interface BaseService<E> {
 /**
  * 添加操作
  * @param data传入要添加的对象
  * @return 返回添加主键ID的值
  */
	public int add(E data);
	/**
	 * 删除操作
	 * @param data传入要删除的对象
	 * @return 返回是否被删除
	 */
  public boolean delete(int data);
  /**
   * 查询操作
   * @param data传入要查询对象的唯一标识符，这个被封装成一个对象
   * ，只要有一个唯一标识符不为空就可以查找到数据
   * @return 返回要查找的对象数据
   */
  public E select(E data);
  /**
   * 更新操作
   * @param 传入要更新的对象
   * @return 返回是否更新成功
   */
  public boolean updata(E data);
}
