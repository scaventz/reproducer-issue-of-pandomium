import org.cef.browser.CefBrowser;
import org.panda_lang.pandomium.Pandomium;
import org.panda_lang.pandomium.wrapper.PandomiumClient;

public class Main {
    public static void main(String[] args) {
        PandomiumClient client = Pandomium.buildDefault().createClient();
        CefBrowser browser = client.loadURL("https://panda-lang.org");
    }
}
