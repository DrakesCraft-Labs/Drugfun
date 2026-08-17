package tsp.drugfun.implementation;

import com.github.drakescraft_labs.slimefun4.api.items.ItemGroup;
import com.github.drakescraft_labs.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import tsp.drugfun.Drugfun;

public final class DrugGroup extends ItemGroup {

    public static final DrugGroup GROUP = new DrugGroup();

    private DrugGroup() {
        super(new NamespacedKey(Drugfun.getInstance(), "drugs"), new CustomItemStack(Material.WHEAT, "&2Tecnologia farmaceutica"));
        register(Drugfun.getInstance());
    }

}
