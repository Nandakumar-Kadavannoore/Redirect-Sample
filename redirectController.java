/**
@author Nandakumar K
**/
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public SampleClass {

  /**
	 * This will redirect to given URL or site
	 */
	@GetMapping(value = "/redirect")
	public void oAuthRedirect(HttpServletResponse httpServletRespone,
                      @RequestParam(value = "state", required = false) String state,
			                @RequestParam(value = "code", required = false) String code) {
		StringBuilder redirectURL = new StringBuilder("www.google.co.in");
		redirectURL.append("?state=");
		redirectURL.append(state);
		redirectURL.append("&code=");
		redirectURL.append(code);

    // Set return status as 302
		httpServletResponse.setHeader("Location", redirectURL.toString());
		httpServletResponse.setStatus(302);
	 }
  
 }
