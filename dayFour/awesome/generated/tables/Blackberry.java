/**
 * This class is generated by jOOQ
 */
package dayFour.awesome.generated.tables;
import dayFour.awesome.generated.tables.Blackberry;
import dayFour.productExample.Blackberry.*;

import dayFour.awesome.generated.*;

import dayFour.awesome.generated.tables.records.BlackberryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Blackberry extends TableImpl<BlackberryRecord> {

    private static final long serialVersionUID = -1085182829;

    /**
     * The reference instance of <code>awesome.blackberry</code>
     */
    public static final Blackberry BLACKBERRY = new Blackberry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlackberryRecord> getRecordType() {
        return BlackberryRecord.class;
    }

    /**
     * The column <code>awesome.blackberry.Id</code>.
     */
    public final TableField<BlackberryRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>awesome.blackberry.model</code>.
     */
    public final TableField<BlackberryRecord, String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>awesome.blackberry.description</code>.
     */
    public final TableField<BlackberryRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>awesome.blackberry.price</code>.
     */
    public final TableField<BlackberryRecord, String> PRICE = createField("price", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>awesome.blackberry.category</code>.
     */
    public final TableField<BlackberryRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>awesome.blackberry</code> table reference
     */
    public Blackberry() {
        this("blackberry", null);
    }

    /**
     * Create an aliased <code>awesome.blackberry</code> table reference
     */
    public Blackberry(String alias) {
        this(alias, BLACKBERRY);
    }

    private Blackberry(String alias, Table<BlackberryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blackberry(String alias, Table<BlackberryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Awesome.AWESOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BlackberryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BLACKBERRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BlackberryRecord> getPrimaryKey() {
        return Keys.KEY_BLACKBERRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BlackberryRecord>> getKeys() {
        return Arrays.<UniqueKey<BlackberryRecord>>asList(Keys.KEY_BLACKBERRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Blackberry as(String alias) {
        return new Blackberry(alias, this);
    }

    /**
     * Rename this table
     */
    public Blackberry rename(String name) {
        return new Blackberry(name, null);
    }
}
