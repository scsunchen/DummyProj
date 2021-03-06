package com.simonsw.common.orm.entity.type;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.usertype.EnhancedUserType;
import org.joda.time.LocalDate;

import com.simonsw.common.orm.entity.type.PersistentLocalDate;

/**
 * @author Simon Lv
 * @since 2012-5-29
 */
@SuppressWarnings("serial")
public class PersistentLocalDate implements EnhancedUserType, Serializable {

	public static final PersistentLocalDate INSTANCE = new PersistentLocalDate();

	private static final int[] SQL_TYPES = new int[] { Types.TIMESTAMP };

	@Override
	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	@Override
	public Class<?> returnedClass() {
		return LocalDate.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == y) {
			return true;
		}
		if (x == null || y == null) {
			return false;
		}
		LocalDate dtx = (LocalDate) x;
		LocalDate dty = (LocalDate) y;

		return dtx.equals(dty);
	}

	@Override
	public int hashCode(Object object) throws HibernateException {
		return object.hashCode();
	}

	@Override
	public Object nullSafeGet(ResultSet resultSet, String[] strings, SessionImplementor sessionImplementor, Object object)
			throws HibernateException, SQLException {
		return nullSafeGet(resultSet, strings[0], sessionImplementor);
	}

	public Object nullSafeGet(ResultSet resultSet, String string, SessionImplementor sessionImplementor) throws SQLException {
		Object timestamp = StandardBasicTypes.TIMESTAMP.nullSafeGet(resultSet, string, sessionImplementor);
		if (timestamp == null) {
			return null;
		}

		return new LocalDate(timestamp);
	}

	@Override
	public void nullSafeSet(PreparedStatement preparedStatement, Object value, int index, SessionImplementor sessionImplementor)
			throws HibernateException, SQLException {
		if (value == null) {
			StandardBasicTypes.TIMESTAMP.nullSafeSet(preparedStatement, null, index, sessionImplementor);
		} else {
			StandardBasicTypes.TIMESTAMP.nullSafeSet(preparedStatement, ((LocalDate) value).toDate(), index, sessionImplementor);
		}
	}

	@Override
	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) value;
	}

	@Override
	public Object assemble(Serializable cached, Object value) throws HibernateException {
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	@Override
	public String objectToSQLString(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toXMLString(Object object) {
		return object.toString();
	}

	@Override
	public Object fromXMLString(String string) {
		return new LocalDate(string);
	}

}
