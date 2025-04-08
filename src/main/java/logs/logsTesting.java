package logs;

import org.apache.logging.log4j.*;

/**
 *     <dependencies>
 *         <dependency>
 *             <groupId>org.apache.logging.log4j</groupId>
 *             <artifactId>log4j-core</artifactId>
 *             <version>2.24.3</version>
 *         </dependency>
 *         <dependency>
 *             <groupId>org.apache.logging.log4j</groupId>
 *             <artifactId>log4j-api</artifactId>
 *             <version>2.24.3</version>
 *         </dependency>
 *     </dependencies>
 */
//Файл конфигурации log4j2.xml лежит в папке src/main/resources.
/**
 * Уровни логирования
 * Log4j поддерживает следующие уровни логирования (от самого низкого к самому высокому):
 *
 * TRACE: очень подробные сообщения, используемые для отладки.
 * DEBUG: сообщения для отладки приложения.
 * INFO: общая информация о работе приложения.
 * WARN: предупреждения о потенциальных проблемах.
 * ERROR: ошибки, которые произошли во время выполнения.
 * FATAL: критические ошибки, которые могут привести к завершению работы приложения.
 */

public class logsTesting {
    private static final Logger logger = LogManager.getLogger(logsTesting.class);

    public static void main(String[] args) {
        logger.info("Приложение запущено");

        try {
            // Ваш код здесь
            logger.debug("Это отладочное сообщение");
            int result = 10 / 0; // Пример ошибки
        } catch (Exception e) {
            logger.error("Произошла ошибка", e);
        }

        logger.info("Приложение завершено");
    }

}
