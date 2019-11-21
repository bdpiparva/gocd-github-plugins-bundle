package in.ashwanthkumar.gocd.github.util;


import static in.ashwanthkumar.utils.lang.StringUtils.isEmpty;

public class URLUtils {
    public boolean isValidURL(String url) {
        if (isEmpty(url))
            return false;
        return isValidHTTPUrl(url) || isValidSSHUrl(url);
    }

    public boolean isValidHTTPUrl(String url) {
        return true;
    }

    /**
     * Simple check for SSH form of Git urls
     * - Should have a @ in the url
     * - It should have 2 parts when split by /
     * <p/>
     * FIXME - Find a better way to do this?
     */
    public boolean isValidSSHUrl(String url) {
        return url.contains("@") && url.replaceAll("//", "/").split("/").length == 2;
    }
}
