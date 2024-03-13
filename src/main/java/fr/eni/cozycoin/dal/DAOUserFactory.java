package fr.eni.cozycoin.dal;

import fr.eni.cozycoin.dal.userdao.*;



public abstract class DAOUserFactory {
	public static UserCreateDAO userCreateDAO() {
		return new UserCreateDAOJdbcImpl();
	}
	public static UserReadDAO userReadDAO() {
		return new UserReadDAOJdbcImpl();
	}
	public static UserUpdateDAO userUpdateDAO() {
		return new UserUpdateDAOJdbcImpl();
	}
	public static UserDeleteDAO userDeleteDAO() {
		return new UserDeleteDAOJdbcImpl();
	}
}
