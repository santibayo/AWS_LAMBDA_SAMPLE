package tech.tcpip.fns;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tech.tcpip.lmb.cms.dto.RequestCms;

import java.util.Optional;

/**
 * Created by santiago on 8/31/18.
 */
public class CmsLambda implements RequestHandler<RequestCms,String>{
    private static Logger log = LoggerFactory.getLogger("fnHandler");
    public CmsLambda(){

        log.info("creating a new instance of CmsLambda");

    }

    public String handleRequest(RequestCms requestCms, Context context) {
        String environment = Optional.ofNullable(System.getenv("CMS_ENV")).orElse("DEV");
        log.info("executing lambda fn");
        RequestCms request = Optional.ofNullable(requestCms).orElse(new RequestCms());
        log.info("request value => {}",request);
        String name = Optional.ofNullable(request.getLang()).orElse("es");
        log.info("executing lambda fn with name( {} )",name);
        String lang = Optional.ofNullable(request.getName()).orElse("index");
        log.info("executing lambda fn with lang( {} )",lang);
        log.info("end executing lambda fn");
        return "<p> Hello World </p>";
    }
}
