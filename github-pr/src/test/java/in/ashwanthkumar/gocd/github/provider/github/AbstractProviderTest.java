package in.ashwanthkumar.gocd.github.provider.github;

import in.ashwanthkumar.gocd.github.provider.Provider;
import in.ashwanthkumar.gocd.github.settings.scm.PluginConfigurationView;


public abstract class AbstractProviderTest {

    protected abstract Provider getProvider();

    protected PluginConfigurationView getScmView() {
        return getProvider().getScmConfigurationView();
    }

    protected PluginConfigurationView getGeneralView() {
        return getProvider().getGeneralConfigurationView();
    }
}
