package com.redick.spi;

/**
 * @author liupenghui
 *  2021/12/24 3:21 下午
 */
@Join
public class SpiExtensionFactory implements ExtensionFactory {

    @Override
    public <T> T getExtension(String key, Class<T> clazz) {
        if (clazz.isAnnotationPresent(SPI.class) && clazz.isInterface()) {
            ExtensionLoader<T> extensionLoader = ExtensionLoader.getExtensionLoader(clazz);
            return extensionLoader.getDefaultJoin();
        }
        return null;
    }
}
