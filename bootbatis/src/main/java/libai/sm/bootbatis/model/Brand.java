package libai.sm.bootbatis.model;

import java.util.List;

public class Brand {
    private List<Proxy> proxyInfos;

    public List<Proxy> getProxyInfos() {
        return proxyInfos;
    }

    public void setProxyInfos(List<Proxy> proxyInfos) {
        this.proxyInfos = proxyInfos;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "proxyInfos=" + proxyInfos +
                '}';
    }
}
