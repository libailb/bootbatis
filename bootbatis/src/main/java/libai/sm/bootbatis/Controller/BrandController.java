package libai.sm.bootbatis.Controller;

import libai.sm.bootbatis.model.Brand;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BrandController {
@PostMapping("save")
    public void save(@RequestBody @Validated Brand params, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        Map<String, String> errorMap = new HashMap<>();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        Map<String, Object> returnData = new HashMap<>();
        returnData.put("fields", errorMap);
        System.out.println(returnData);
    } else {
        System.out.println(params);
    }
}





}
