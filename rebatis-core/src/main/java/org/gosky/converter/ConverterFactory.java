package org.gosky.converter;

import com.github.jasync.sql.db.RowData;

/**
 * @Auther: guozhong
 * @Date: 2019-04-02 17:03
 * @Description:
 */
public interface ConverterFactory {

    void init();

    Object convert(RowData qr, Class pojoClass);


}
