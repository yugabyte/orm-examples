/*
 * This file is generated by jOOQ.
 */
package com.yugabyte.jooqdemo.db.tables;


import com.yugabyte.jooqdemo.db.Jooq;
import com.yugabyte.jooqdemo.db.Keys;
import com.yugabyte.jooqdemo.db.tables.records.UsersRecord;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.16.2",
        "schema version:jooq_1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>jooq.users.user_id</code>.
     */
    public final TableField<UsersRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>jooq.users.first_name</code>.
     */
    public final TableField<UsersRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jooq.users.last_name</code>.
     */
    public final TableField<UsersRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>jooq.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.CLOB.nullable(false), this, "");

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>jooq.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>jooq.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>jooq.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Jooq.JOOQ;
    }

    @Override
    public Identity<UsersRecord, Long> getIdentity() {
        return (Identity<UsersRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.PK_USERS;
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
