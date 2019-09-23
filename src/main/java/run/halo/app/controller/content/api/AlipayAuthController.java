package run.halo.app.controller.content.api;

import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("AlipayAuthController")
@RequestMapping("/api/alipay/auth")
public class AlipayAuthController {
    @GetMapping("redirect")
    public Map<String, Object> redirect(@RequestParam String app_id, @RequestParam String scope,
        @RequestParam String auth_code) {
        Map<String, Object> res = Maps.newHashMap();
        res.put("app_id", app_id);
        res.put("scope", scope);
        res.put("auth_code", auth_code);
        return res;
    }

}
