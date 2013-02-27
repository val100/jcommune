package org.jtalks.jcommune.service;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

/** @author stanislav bashkirtsev */
@ContextConfiguration(locations = {
        "classpath:/org/jtalks/jcommune/model/entity/applicationContext-dao.xml",
        "classpath:org/jtalks/jcommune/model/entity/applicationContext-properties.xml",
        "classpath:org/jtalks/jcommune/service/applicationContext-service.xml",
        "classpath:org/jtalks/jcommune/service/email-context.xml",
        "classpath:org/jtalks/jcommune/service/security-service-context.xml",
        "classpath:org/jtalks/jcommune/service/applicationContext-mocks.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class CreateTopicComponentTest extends AbstractTransactionalTestNGSpringContextTests {
    @Test
    public void testName() throws Exception {

    }
}
