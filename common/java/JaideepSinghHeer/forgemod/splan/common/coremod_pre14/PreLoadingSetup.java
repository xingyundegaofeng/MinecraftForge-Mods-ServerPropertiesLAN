package JaideepSinghHeer.forgemod.splan.common.coremod_pre14;

import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraftforge.fml.relauncher.IFMLCallHook;

import java.util.Map;

public class PreLoadingSetup implements IFMLCallHook {
    // FML injects some data before calling.
    private static Map<String, Object> fmlInjectedData;
    @Override
    public void injectData(Map<String, Object> data) {
        CoremodContext.classloader = (LaunchClassLoader) data.get("classLoader");
        CoremodContext.deobfuscationFileName = (String) data.get("deobfuscationFileName");
    }
    // FML calls this function before minecraft starts.
    @Override
    public Void call() throws Exception {
        // nothing to do yet ;)
        return null;
    }
}
