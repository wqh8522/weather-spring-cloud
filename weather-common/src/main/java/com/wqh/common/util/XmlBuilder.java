package com.wqh.common.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author wanqh
 * @date 2018/02/01 17:16
 * @description: xml工具类
 */
public class XmlBuilder {
    /**
     * 将xml转为指定的POJO
     * @param clazz
     * @param xmlStr
     * @return
     * @throws Exception
     */
    public static Object xmlStrToObject(Class<?> clazz,String xmlStr) throws Exception {
        Object object = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        reader = new StringReader(xmlStr);
        object = unmarshaller.unmarshal(reader);
        if(null != reader){
            reader.close();
        }
        return object;
    }
}
